package xyz.nuti.example.modern7;

/**
 * Created by Hyeonil Jeong on 2015-12-14.
 */
public class Modern7 {
	public void run() {
		println(1, 2, 3, (i1, i2, i3)->String.valueOf(i1 + i2 + i3));
		println("Area is ", 12, 20, (message, length, width) -> message + (length * width));
		println(1L, "Jeong", "test@email.com",
				(id, name, email) -> "User Info: ID=" + id + ", name=" + name + ", email=" + email);
	}

	private <T1, T2, T3> void println(T1 t1, T2 t2, T3 t3, Function3<T1, T2, T3, String> function) {
		System.out.println(function.apply(t1, t2, t3));
	}

	public static void main(String[] args) {
		Modern7 app = new Modern7();

		app.run();
	}
}
