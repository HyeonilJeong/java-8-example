package xyz.nuti.example.modern2;

/**
 * Created by Hyeonil Jeong on 2015-12-09.
 *
 * Requirement
 *
 * Calculator for addition, subtraction and multiplication.
 */
public class CalculatorService3 {
	public int calculate(char calculation, int num1, int num2) {
		if (calculation == '+') {
			return num1 + num2;
		} else if (calculation == '-') {
			return num1 - num2;
		} else if (calculation == '*') {
			return num1 * num2;
		} else {
			throw new IllegalArgumentException("Unknown calculation: " + calculation);
		}
	}
}
