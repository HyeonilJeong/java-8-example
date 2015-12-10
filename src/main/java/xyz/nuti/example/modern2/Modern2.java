package xyz.nuti.example.modern2;

/**
 * Created by Hyeonil Jeong on 2015-12-09.
 */
public class Modern2 {
	public static void main(String[] args) {
		Modern2 app = new Modern2();
		app.run();
	}

	public void run() {
		System.out.println("example1\n");
		runExample1();
		System.out.println("\nexample2\n");
		runExample2();
		System.out.println("\nexample3\n");
		runExample3();
		System.out.println("\nexample4\n");
		runExample4();
		System.out.println("\nexample5\n");
		runExample5();
		System.out.println("\nexample6\n");
		runExample6();
	}

	private void runExample1() {
		final CalculatorService1 calculatorService = new CalculatorService1();
		final int result = calculatorService.calculate(1, 1);
		System.out.println(result);
	}

	private void runExample2() {
		final CalculatorService2 calculatorService = new CalculatorService2();
		final int additionResult = calculatorService.calculate('+', 1, 1);
		System.out.println(additionResult);
		final int subtractionResult = calculatorService.calculate('-', 1, 1);
		System.out.println(subtractionResult);
	}

	private void runExample3() {
		final CalculatorService3 calculatorService = new CalculatorService3();
		final int additionResult = calculatorService.calculate('+', 1, 1);
		System.out.println(additionResult);
		final int subtractionResult = calculatorService.calculate('-', 1, 1);
		System.out.println(subtractionResult);
		final int multiplicationResult = calculatorService.calculate('*', 1, 1);
		System.out.println(multiplicationResult);
	}

	private void runExample4() {
		final CalculatorService4 calculatorService = new CalculatorService4();
		final int additionResult = calculatorService.calculate('+', 1, 1);
		System.out.println(additionResult);
		final int subtractionResult = calculatorService.calculate('-', 1, 1);
		System.out.println(subtractionResult);
		final int multiplicationResult = calculatorService.calculate('*', 1, 1);
		System.out.println(multiplicationResult);
		final int divisionResult = calculatorService.calculate('/', 8, 4);
		System.out.println(divisionResult);
	}

	private void runExample5() {
		final CalculatorService5 calculatorService = new CalculatorService5();
		final int additionResult = calculatorService.calculate(new Addition(), 1, 1);
		System.out.println(additionResult);
		final int subtractionResult = calculatorService.calculate(new Subtraction(), 1, 1);
		System.out.println(subtractionResult);
		final int multiplicationResult = calculatorService.calculate(new Multiplication(), 1, 1);
		System.out.println(multiplicationResult);
		final int divisionResult = calculatorService.calculate(new Division(), 8, 4);
		System.out.println(divisionResult);
	}

	private void runExample6() {
		final CalculatorService5 calculatorService = new CalculatorService5();
		final int additionResult = calculatorService.calculate((num1, num2) -> num1 + num2, 1, 1);
		System.out.println(additionResult);
		final int subtractionResult = calculatorService.calculate((num1, num2) -> num1 - num2, 1, 1);
		System.out.println(subtractionResult);
		final int multiplicationResult = calculatorService.calculate((num1, num2) -> num1 * num2, 1, 1);
		System.out.println(multiplicationResult);
		final int divisionResult = calculatorService.calculate((num1, num2) -> num1 / num2, 8, 4);
		System.out.println(divisionResult);
	}
}
