package xyz.nuti.example.modern8;

import java.util.List;

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
}
