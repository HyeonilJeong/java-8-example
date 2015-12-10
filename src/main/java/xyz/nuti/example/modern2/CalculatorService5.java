package xyz.nuti.example.modern2;

/**
 * Created by Hyeonil Jeong on 2015-12-09.
 *
 * Requirement
 *
 * Calculator for addition, subtraction, multiplication and division.
 *
 * Using strategy pattern.
 */
public class CalculatorService5 {

	public CalculatorService5() {
	}

	public int calculate(Calculation calculation, int num1, int num2) {
		return calculation.calculate(num1, num2);
	}
}
