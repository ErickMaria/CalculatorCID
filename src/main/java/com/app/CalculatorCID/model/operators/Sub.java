package com.app.CalculatorCID.model.operators;

import com.app.CalculatorCID.model.BasicCaculator;

public class Sub implements BasicCaculator {

	@Override
	public double calculate(double number1, double number2) {
		return number1-number2;
	}

}
