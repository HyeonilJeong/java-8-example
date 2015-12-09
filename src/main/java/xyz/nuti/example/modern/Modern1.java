package xyz.nuti.example.modern;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * Created by hyeonil on 15. 12. 5.
 */
public class Modern1 {
	public void run() {
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// on prev java 8
		final StringBuilder stringBuilder = new StringBuilder();

		final String separator = " : ";
		for (int number : numbers) {
			stringBuilder.append(number).append(separator);
		}
		final int length = stringBuilder.length();
		if (length > 0) {
			stringBuilder.delete(length - separator.length(), length);
		}
		System.out.println(stringBuilder.toString());

		// on java8
		String joinStr = numbers.stream()
							.map(String::valueOf)
							.collect(joining(" : "));
		System.out.println(joinStr);
	}

	public static void main(String[] args) {
		Modern1 app = new Modern1();

		app.run();
	}
}
