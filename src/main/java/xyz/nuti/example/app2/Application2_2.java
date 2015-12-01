package xyz.nuti.example.app2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2_2 {
	
	public interface LPadAction {
		String lPad(Integer number);
	}
	
	public class LPadNumber implements LPadAction {
		@Override
		public String lPad(Integer number) {
			return "number: " + number;
		}
	}
	
	public class LPadInteger implements LPadAction {
		@Override
		public String lPad(Integer number) {
			return "integer: " + number;
		}
	}
	
	public class LPadSequence implements LPadAction {
		@Override
		public String lPad(Integer number) {
			return "sequence: " + number;
		}
	}
	
	public List<String> loopFor(List<Integer> numbers, LPadAction lPadAction) {
		List<String> result = new ArrayList<String>();
		
		for (Integer number : numbers) {
			result.add(lPadAction.lPad(number));
		}
		
		return result;
	}
	
	public void run() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(loopFor(numbers, new LPadNumber()));
		System.out.println(loopFor(numbers, new LPadInteger()));
		System.out.println(loopFor(numbers, new LPadSequence()));
	}
	
	public static void main(String[] args) {
		Application2_2 app = new Application2_2();
		app.run();
	}
}
