package xyz.nuti.example.modern8;

/**
 * Created by Hyeonil Jeong on 2015-12-15.
 */
@FunctionalInterface
public interface InvalidFunctionalInterface {
	<T> String mkString(T value);
}
