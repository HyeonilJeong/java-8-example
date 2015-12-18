package xyz.nuti.example.modern8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Hyeonil Jeong on 2015-12-15.
 */
public class Modern8 {
	public void run() {
		runExample1();

		runExample2();

		runExample3();

		runExample4();
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

		System.out.println("products >= $20: " + filter(productList, product -> product.getPrice().compareTo(twenty) >= 0));
		System.out.println("products <= $10: " + filter(productList, product -> product.getPrice().compareTo(new BigDecimal("10")) <= 0));

		List<Product> expensiveProducts = filter(productList, product -> product.getPrice().compareTo(new BigDecimal("50")) > 0);
		final List<DiscountedProduct> discountedProducts = map(expensiveProducts, product -> new DiscountedProduct(product.getId(), product.getName(), product.getPrice().multiply(new BigDecimal("0.5"))));

		System.out.println("expensive products: " + expensiveProducts);
		System.out.println("discounted products: " + discountedProducts);

		final Predicate<Product> lessThanOrEqualTo30 = product -> product.getPrice().compareTo(new BigDecimal("30")) <= 0; ;

		System.out.println("discounted products (<= $30): " + filter(discountedProducts, lessThanOrEqualTo30));
		System.out.println("products (<= $30): " + filter(productList, lessThanOrEqualTo30));

		List<BigDecimal> prices = map(productList, product -> product.getPrice());
		BigDecimal total = BigDecimal.ZERO;

		for (final BigDecimal price : prices) {
			total = total.add(price);
		}

		System.out.println("total: " + total);
		System.out.println("new total: " + total(productList, product -> product.getPrice()));
		System.out.println("discounted total: " + total(discountedProducts, product -> product.getPrice()));
	}

	private void runExample4() {
		Order order = new Order(1L, "on-1234", Arrays.asList(
				new OrderedItem(1L, new Product(1L, "A", new BigDecimal("10.00")), 2),
				new OrderedItem(2L, new Product(2L, "B", new BigDecimal("55.50")), 1),
				new OrderedItem(3L, new Product(3L, "C", new BigDecimal("17.45")), 5),
				new OrderedItem(4L, new Product(4L, "D", new BigDecimal("23.00")), 10),
				new OrderedItem(5L, new Product(5L, "E", new BigDecimal("110.99")), 7)
		));

		System.out.println("total price: " + order.totalPrice());
	}

	private <T> List<T> filter(List<T> list, Predicate<? super T> predicate) {
		final List<T> result = new ArrayList<T>();

		for (final T t : list) {
			if (predicate.test(t)) {
				result.add(t);
			}
		}
		return result;
	}

	private <T, R> List<R> map(List<T> list, Function<T, R> function) {
		List<R> result = new ArrayList<R>();

		for (final T t : list) {
			result.add(function.apply(t));
		}

		return result;
	}

	private <T> BigDecimal total(List<T> list, Function<T, BigDecimal> mapper) {
		BigDecimal total = BigDecimal.ZERO;

		for (final T t : list) {
			total = total.add(mapper.apply(t));
		}

		return total;
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
