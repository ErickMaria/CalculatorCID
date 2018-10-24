package com.app.CalculatorCID.model;

public class ConvertOperator {
	
	private static final String operators = "+-*:";  
	
	public static int convert(String operator) {
	
		String[] operatorsSplited = operators.split("");
		
		int operatorPosition = 5;
		
		for(int i = 0; i < operatorsSplited.length; i++) {
			if(operator.equals(operatorsSplited[i])) {
				operatorPosition = i;
			}
		}
		
		return operatorPosition;
	}
	
}
