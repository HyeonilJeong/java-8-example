package xyz.nuti.example.modern3;

import java.util.function.Function;

/**
 * Created by Hyeonil Jeong on 2015-12-10.
 */
public class Modern3 {
	public void run() {
		Function<String, Integer> toInt = (final String str) -> {
			return Integer.parseInt(str);
		};
		System.out.println(toInt.apply("100"));

		toInt = str -> Integer.parseInt(str);
		System.out.println(toInt.apply("100"));
	}

	public static void main(String[] args) {
		Modern3 app = new Modern3();
		app.run();
	}
}
