package com.codingdojo.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		
		calc.setOperantOne (10.5);
		calc.setOperation("+");
		calc.setOperandTwo(5.2);
		calc.performOperation();
		calc.getResult();
		System.out.println (calc.getResult() );
		 
		calc.setOperantOne (10.5);
		calc.setOperation("-");
		calc.setOperandTwo(5.2);
		calc.performOperation();
		calc.getResult();
		 System.out.println (calc.getResult() );
	}

}

