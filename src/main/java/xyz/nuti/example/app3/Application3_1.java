package xyz.nuti.example.app3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Application3_1 {

	public <T> List<T> filter(List<T> inputList, Predicate<T> filter) {
		List<T> result = new ArrayList<T>();
		
		for (T t : inputList) {
			if (filter.test(t) == true) {
				result.add(t);
			}
		}
		
		return result;
	}
	
	public void run() {
		List<Integer> numbers = Arrays.asList(-5,-4,-3,-2,-1,0,1,2,3,4,5);
		System.out.println("positive integers: " + filter(numbers, i -> i > 0));
		System.out.println("lessThan3 integers: " + filter(numbers, i -> i < 3));
	}
	
	public static void main(String[] args) {
		Application3_1 app = new Application3_1();
		app.run();
	}
}
