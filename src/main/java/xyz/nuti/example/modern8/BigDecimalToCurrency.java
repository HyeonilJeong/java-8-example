package xyz.nuti.example.modern8;

import java.math.BigDecimal;

/**
 * Created by Hyeonil Jeong on 2015-12-15.
 */
@FunctionalInterface
public interface BigDecimalToCurrency {
	String toCurrency(BigDecimal value);
}
