package xyz.nuti.example.app4;

import java.util.function.Consumer;

public class Application4_1 {

	public void run() {
		Consumer<String> printString = t -> System.out.println(t + ", Hello");
		printString.andThen(t -> System.out.println("after")).accept("java");;
		printString.accept("Java8");
		printString.accept("lambda");
	}
	
	public static void main(String[] args) {
		Application4_1 app = new Application4_1();
		app.run();
	}
}
