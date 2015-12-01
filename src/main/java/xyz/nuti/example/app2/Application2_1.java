package xyz.nuti.example.app2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2_1 {

	public List<String> loopForNumber(List<Integer> numbers) {
		List<String> result = new ArrayList<String>();
		
		for (Integer number : numbers) {
			result.add(lPadNumber(number));
		}
		
		return result;
	}
	
	public List<String> loopForInteger(List<Integer> numbers) {
		List<String> result = new ArrayList<String>();
		
		for (Integer number : numbers) {
			result.add(lPadInteger(number));
		}
		
		return result;
	}
	
	public List<String> loopForSequence(List<Integer> numbers) {
		List<String> result = new ArrayList<String>();
		
		for (Integer number : numbers) {
			result.add(lPadSequence(number));
		}
		
		return result;
	}
	
	public String lPadNumber(Integer number) {
		return "number: " + number;
	}
	
	public String lPadInteger(Integer number) {
		return "integer: " + number;
	}
	
	public String lPadSequence(Integer number) {
		return "sequence: " + number;
	}
	
	public void run() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(loopForNumber(numbers));
		System.out.println(loopForInteger(numbers));
		System.out.println(loopForSequence(numbers));
	}
	
	public static void main(String[] args) {
		Application2_1 app = new Application2_1();
		
		app.run();
	}
}
