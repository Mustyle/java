package org.fool.pattern.strategy;

public class DivideStrategy implements Strategy {

	@Override
	public int calculate(int a, int b) {
		return a / b;
	}

}
