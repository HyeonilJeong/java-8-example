package xyz.nuti.example.modern8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Hyeonil Jeong on 2015-12-15.
 */
public class Modern8 {
	public void run() {
		runExample1();

		runExample2();

		runExample3();
	}

	private void runExample1() {
		BigDecimalToCurrency bigDecimalToCurrency = bd -> "$" + bd.toString();

		System.out.println(bigDecimalToCurrency.toCurrency(new BigDecimal("120.00")));

		final InvalidFunctionalInterface anonymousClass = new InvalidFunctionalInterface() {
			@Override
			public <T> String mkString(final T value) {
				return value.toString();
			}
		};

		System.out.println("anonymous class: " + anonymousClass.mkString(123));

		// invalid functional interface
		// final InvalidFunctionalInterface invalidFunctionalInterface = value -> value.toString();
		// System.out.println(invalidFunctionalInterface.mkString(123));
	}

	private void runExample2() {
		final List<Product> productList = makeProductList();
		final List<Product> result = new ArrayList<Product>();

		final BigDecimal twenty = new BigDecimal("20");
		for (final Product product : productList) {
			if (product.getPrice().compareTo(twenty) >= 0) {
				result.add(product);
			}
		}

		System.out.println(result);
	}

	private void runExample3() {
		final List<Product> productList = makeProductList();
		final BigDecimal twenty = new BigDecimal("20");

		final List<Product> result = filter(productList, product -> product.getPrice().compareTo(twenty) >= 0);

		System.out.println(result);
	}

	private <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		final List<T> result = new ArrayList<T>();

		for (final T t : list) {
			if (predicate.test(t)) {
				result.add(t);
			}
		}
		return result;
	}

	private List<Product> makeProductList() {
		return Arrays.asList(
			new Product(1L, "A", new BigDecimal("10.00")),
			new Product(2L, "B", new BigDecimal("55.50")),
			new Product(3L, "C", new BigDecimal("17.45")),
			new Product(4L, "D", new BigDecimal("23.00")),
			new Product(5L, "E", new BigDecimal("110.99"))
		);
	}

	public static void main(String[] args) {
		Modern8 app = new Modern8();
		app.run();
	}
}
