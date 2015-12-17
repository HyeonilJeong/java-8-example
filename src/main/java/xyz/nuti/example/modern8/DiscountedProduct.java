package xyz.nuti.example.modern8;

import java.math.BigDecimal;

/**
 * Created by Hyeonil Jeong on 2015-12-17.
 */
public class DiscountedProduct extends Product {
	public DiscountedProduct(final Long id, final String name, final BigDecimal price) {
		super(id, name, price);
	}
}
