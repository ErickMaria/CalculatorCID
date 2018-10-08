package com.app.CalculatorCID.model;

import com.app.CalculatorCID.model.operators.Div;
import com.app.CalculatorCID.model.operators.Mult;
import com.app.CalculatorCID.model.operators.Sub;
import com.app.CalculatorCID.model.operators.Sum;

public enum ChoiceOperator{
	
	SUM {
		@Override
		public BasicCaculator getOperator() {
			return new Sum();
		}
	}, SUB {
		@Override
		public BasicCaculator getOperator() {
			return new Sub();
		}
	}, MULT {
		@Override
		public BasicCaculator getOperator() {
			return new Mult();
		}
	}, DIV {
		@Override
		public BasicCaculator getOperator() {
			return new Div();
		}
	};
	
	public abstract BasicCaculator getOperator();
}
