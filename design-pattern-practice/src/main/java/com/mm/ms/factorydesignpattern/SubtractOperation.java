package com.mm.ms.factorydesignpattern;

public class SubtractOperation implements Operation {
	@Override
	public double calculate(double number1, double number2) {
		return number1 - number2;
	}
}
