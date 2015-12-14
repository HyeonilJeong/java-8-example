package xyz.nuti.example.modern6;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * Created by Hyeonil Jeong on 2015-12-14.
 */
public class Modern6 {

	public void run() {
		final Supplier<String> helloSupplier = () -> "Hello ";

		System.out.println(helloSupplier.get() + "world");

		System.out.println("example1");
		long start = System.currentTimeMillis();
		printIfValidIndex(0, getVeryExpensiveValue());
		printIfValidIndex(-1, getVeryExpensiveValue());
		printIfValidIndex(1, getVeryExpensiveValue());
		printIfValidIndex(-2, getVeryExpensiveValue());
		System.out.println("running time: " + ((System.currentTimeMillis() - start) / 1000) + " seconds");

		System.out.println("example2");
		start = System.currentTimeMillis();
		printIfValidIndex(0, () -> getVeryExpensiveValue());
		printIfValidIndex(-1, () -> getVeryExpensiveValue());
		printIfValidIndex(1, () -> getVeryExpensiveValue());
		printIfValidIndex(-2, () -> getVeryExpensiveValue());
		System.out.println("running time: " + ((System.currentTimeMillis() - start) / 1000) + " seconds");
	}

	private String getVeryExpensiveValue() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return "car";
	}

	public void printIfValidIndex(int number, String value) {
		if (number >= 0) {
			System.out.println("The value is " + value + ".");
		} else {
			System.out.println("Invalid");
		}
	}

	public void printIfValidIndex(int number, Supplier<String> valueSupplier) {
		if (number >= 0) {
			System.out.println("The value is " + valueSupplier.get() + ".");
		} else {
			System.out.println("Invalid");
		}
	}

	public static void main(String[] args) {
		Modern6 app = new Modern6();
		app.run();
	}
}
