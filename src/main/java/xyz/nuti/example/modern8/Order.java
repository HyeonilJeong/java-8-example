package xyz.nuti.example.modern8;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Hyeonil Jeong on 2015-12-17.
 */
public class Order {
	private Long id;
	private String orderNumber;

	private List<OrderedItem> items;

	public Order() {
	}

	public Order(final Long id, final String orderNumber, final List<OrderedItem> items) {
		this.id = id;
		this.orderNumber = orderNumber;
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(final String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public List<OrderedItem> getItems() {
		return items;
	}

	public void setItems(final List<OrderedItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return new StringBuilder("Order{")
				.append("id=").append(id)
				.append(", orderNumber='").append(orderNumber).append('\'')
				.append(", items=").append(items)
				.append('}')
				.toString();
	}

	public BigDecimal totalPrice() {
		return total(items, item -> item.getItemTotal());
	}

	private <T> BigDecimal total(List<T> list, Function<T, BigDecimal> mapper) {
		BigDecimal total = BigDecimal.ZERO;

		for (final T t : list) {
			total = total.add(mapper.apply(t));
		}

		return total;
	}
}
