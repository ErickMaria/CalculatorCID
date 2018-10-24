window.onload = function(){
    url = window.location.href;
    operation = '';
    inputShow = $("#result");
    inputShow.val('');
}

$(".calc-button").click(function() {
    operation = operation + $(this).text();

    if(operation.includes('C') == true){
        operation = '';
    }
    if(operation.includes('=') == true){
        operation = operation.substring(0, operation.length-1);
        sendOperation(operation)
    }

    inputShow.val(operation);

});

function sendOperation(op){
    operators = ["+","-","x",":"];
    operator = '';

    pattern1 =  new RegExp(/^\d+/);
    pattern2 =  new RegExp(/\d+$/);
    
    for (i = 0; i < operators.length; i++){
        if(op.includes(operators[i]) == true){
            operator = operators[i]
            if(operator == "x"){
                operator = "*"
            }
        }
    }
    
    console.log(op.match(pattern1));
    console.log(operator);
    console.log(op.match(pattern2));

    n1 = op.match(pattern1);
    n2 = op.match(pattern2);

    if(n1 == null || n2 == null){
        operation = 'Error';
        console.log("error value nulo");
        return;
    }  
    fetch(url="/calculate/"+n1+"/"+operator+"/"+n2, {
    method: 'GET'
    })
    .then(response => {
        response.json().then(function(data){
            inputShow.val(data);
            operation = '';
        })
    })
    .catch(error => {
        inputShow.val("Error");
        operation = '';
    } )
    
}