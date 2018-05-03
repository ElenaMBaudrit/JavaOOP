package com.codingdojo.calculator;

public class Calculator implements Operators, java.io.Serializable{
		private double operandOne;
		private String operation;
		private double operandTwo;
		private double result;
	
	public Calculator (double operandOne, String operation, double operandTwo, double result) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
		this.result = result;
	}
	
//	zero argument constructor
	public Calculator() {
	}
	
//Getters and Setters
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperantOne(double operandOne) {
		this.operandOne  = operandOne;
	}
	//
	public String getOperation() {
		return operation;
	}
	public void setOperation(String string) {
		this.operation = string;
	}
	//
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo =  operandTwo;
	}
	//
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
//	Operations
	public void performOperation () {
		if (operation == "+") {
		setResult(getOperandOne() + getOperandTwo());
		System.out.println("The result of the operation is "+getResult());
		}
		else {
			setResult(getOperandOne() - getOperandTwo());
		}
	
	}

}
