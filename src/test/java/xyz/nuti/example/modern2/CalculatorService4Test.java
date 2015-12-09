package xyz.nuti.example.modern2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by Hyeonil Jeong on 2015-12-09.
 */
public class CalculatorService4Test {

	@Test
	public void testCalculateAddition() throws Exception {
		CalculatorService4 calculatorService = new CalculatorService4();

		final int actual = calculatorService.calculate('+', 1, 1);

		assertThat(actual).isEqualTo(2);
	}

	@Test
	public void testCalculationSubtraction() throws Exception {
		CalculatorService4 calculatorService = new CalculatorService4();

		final int actual = calculatorService.calculate('-', 1, 1);

		assertThat(actual).isEqualTo(0);
	}

	@Test
	public void testCalculationMultiplication() throws Exception {
		CalculatorService4 calculatorService = new CalculatorService4();

		final int actual = calculatorService.calculate('*', 1, 1);

		assertThat(actual).isEqualTo(1);
	}

	@Test
	public void testCalculationDivision() throws Exception {
		CalculatorService4 calculatorService = new CalculatorService4();

		final int actual = calculatorService.calculate('/', 8, 4);

		assertThat(actual).isEqualTo(2);
	}
}