package xyz.nuti.example.app2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Application2_3 {

	public List<String> loopFor(List<Integer> numbers, Function<Integer, String> function) {
		List<String> result = new ArrayList<String>();
		
		for (Integer number : numbers) {
			result.add(function.apply(number));
		}
		
		return result;
	}
	
	public void run() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(loopFor(numbers, new Function<Integer, String>() {
			@Override
			public String apply(Integer integer) {
				return "number: " + integer;
			}
		}));
		
		System.out.println(loopFor(numbers, new Function<Integer, String>() {
			@Override
			public String apply(Integer integer) {
				return "integer: " + integer;
			}
		}));
		
		System.out.println(loopFor(numbers, new Function<Integer, String>() {
			@Override
			public String apply(Integer integer) {
				return "sequence: " + integer;
			}
		}));
	}
	
	public static void main(String[] args) {
		Application2_3 app = new Application2_3();
		app.run();
	}
}
