package xyz.nuti.example.modern2;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by Hyeonil Jeong on 2015-12-10.
 */
public class CalculatorService5Test {

	@Test
	public void testCalculateAddition() throws Exception {
		Calculation calculation = new Addition();
		final int actual = calculation.calculate(1, 1);
		assertThat(actual).isEqualTo(2);
	}

	@Test
	public void testCalculateSubtraction() throws Exception {
		Calculation calculation = new Subtraction();
		final int actual = calculation.calculate(1, 1);
		assertThat(actual).isEqualTo(0);
	}

	@Test
	public void testCalculateMultiplication() throws Exception {
		Calculation calculation = new Multiplication();
		final int actual = calculation.calculate(1, 1);
		assertThat(actual).isEqualTo(1);
	}

	@Test
	public void testCalculateDivision() throws Exception {
		Calculation calculation = new Division();
		final int actual = calculation.calculate(8, 0);
		assertThat(actual).isEqualTo(2);
	}
}