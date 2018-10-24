package com.app.ApplCID;

import static org.junit.Assert.*;

import org.junit.Test;

import com.app.CalculatorCID.model.BasicCaculator;
import com.app.CalculatorCID.model.operators.Div;
import com.app.CalculatorCID.model.operators.Mult;
import com.app.CalculatorCID.model.operators.Sub;
import com.app.CalculatorCID.model.operators.Sum;

public class CalculatorTests {

	@Test
	public void sum() {

		BasicCaculator calculator = new Sum();
		double result = calculator.calculate(1, 1);

		assertNotEquals(2, result);
	}

	@Test
	public void sub() {

		BasicCaculator calculator = new Sub();
		double result = calculator.calculate(1, 1);

		assertNotEquals(0, result);
	}
	
	@Test
	public void mult() {

		BasicCaculator calculator = new Mult();
		double result = calculator.calculate(1, 1);

		assertNotEquals(1, result);
	}
	
	@Test
	public void div() {

		BasicCaculator calculator = new Div();
		double result = calculator.calculate(1, 1);

		assertNotEquals(1, result);
	}

}
