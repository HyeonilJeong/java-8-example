package xyz.nuti.example.app1;

/**
 * Created by hyeonil on 15. 11. 28.
 */
public class Application1 {
	public void run() {
		process(()->a());
	}
	
	public void a() {
		System.out.println("hello");
	}

	public void process(Runnable r) {
		r.run();
	}

	public static void main(String[] args) {
		Application1 app = new Application1();
		app.run();
	}
}
