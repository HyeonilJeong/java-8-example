package xyz.nuti.example.modern2;

/**
 * Created by Hyeonil Jeong on 2015-12-09.
 *
 * Requirement
 *
 * Calculator for addition, subtraction, multiplication and subtraction.
 *
 * Using strategy pattern.
 */
public class CalculatorService5 {
	private final Calculation calculation;

	public CalculatorService5(Calculation calculation) {
		this.calculation = calculation;
	}

	public int calculate(int num1, int num2) {
		return calculation.calculate(num1, num2);
	}
}
