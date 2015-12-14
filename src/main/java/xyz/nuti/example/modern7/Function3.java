package xyz.nuti.example.modern7;

/**
 * Created by Hyeonil Jeong on 2015-12-14.
 */
@FunctionalInterface
public interface Function3<T1, T2, T3, R> {
	R apply(T1 t1, T2 t2, T3 t3);

	default void print() {

	}
}
