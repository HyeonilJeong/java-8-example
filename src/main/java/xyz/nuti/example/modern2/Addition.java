package xyz.nuti.example.modern2;

/**
 * Created by Hyeonil Jeong on 2015-12-09.
 */
public class Addition implements Calculation {
	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}
}
