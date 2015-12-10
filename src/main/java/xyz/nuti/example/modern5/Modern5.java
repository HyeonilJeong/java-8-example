package xyz.nuti.example.modern5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Hyeonil Jeong on 2015-12-10.
 */
public class Modern5 {
	public void run() {
		Predicate<Integer> isPositive = num -> num > 0;
		System.out.println(isPositive.test(1));
		System.out.println(isPositive.test(0));
		System.out.println(isPositive.test(-1));

		List<Integer> numbers = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);

		System.out.println(filter(numbers, isPositive));
	}

	private <T> List<T> filter(List<T> list, Predicate<T> filter) {
		List<T> result = null;

		result = list.stream().filter(filter).collect(Collectors.toList());

		return result;
	}

	public static void main(String[] args) {
		Modern5 app = new Modern5();
		app.run();
	}
}
