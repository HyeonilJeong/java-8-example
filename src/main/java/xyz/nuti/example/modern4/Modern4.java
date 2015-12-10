package xyz.nuti.example.modern4;

import java.util.function.Consumer;

/**
 * Created by Hyeonil Jeong on 2015-12-10.
 */
public class Modern4 {
	public void run() {
		final Consumer<String> print = str -> System.out.println("hello, " + str);
		print.accept("java 8");
	}

	public static void main(String[] args) {
		Modern4 app = new Modern4();
		app.run();
	}
}
