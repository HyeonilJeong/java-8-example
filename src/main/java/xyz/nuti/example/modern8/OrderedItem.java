package xyz.nuti.example.modern8;

import java.math.BigDecimal;

/**
 * Created by Hyeonil Jeong on 2015-12-17.
 */
public class OrderedItem {
	private Long id;
	private Product product;
	private int quantity;

	public BigDecimal getItemTotal() {
		return product.getPrice().multiply(new BigDecimal(quantity));
	}

	public OrderedItem() {
	}

	public OrderedItem(final Long id, final Product product, final int quantity) {
		this.id = id;
		this.product = product;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(final Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(final int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return new StringBuilder("OrderedItem{")
				.append("id=").append(id)
				.append(", product=").append(product)
				.append(", quantity=").append(quantity)
				.append('}')
				.toString();
	}
}
