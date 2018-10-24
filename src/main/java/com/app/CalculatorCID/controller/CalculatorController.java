package com.app.CalculatorCID.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.CalculatorCID.model.BasicCaculator;
import com.app.CalculatorCID.model.ChoiceOperator;
import com.app.CalculatorCID.model.ConvertOperator;

@Controller()
public class CalculatorController {
	
	@RequestMapping(value = "calculate/{number1}/{operator}/{number2}", method = RequestMethod.GET)
	public String result(@PathVariable("number1") Double number1, @PathVariable("operator") String operator,
			@PathVariable("number2") Double number2) {
		
		System.out.println(number1);
		System.out.println(operator);
		System.out.println(number2);
		
		int operat = ConvertOperator.convert(operator);
		
		if(operat != 5) {
			
			ChoiceOperator choicedOperator = ChoiceOperator.values()[operat];
			BasicCaculator calculator = choicedOperator.getOperator();
			
			return "" + calculator.calculate(number1, number2);
			
		}

		return "invalid operation";
	}

}
