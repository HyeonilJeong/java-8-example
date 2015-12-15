package xyz.nuti.example.modern8;

import java.math.BigDecimal;

/**
 * Created by Hyeonil Jeong on 2015-12-15.
 */
public class Product {
	private Long id;
	private String name;
	private BigDecimal price;

	public Product() {
	}

	public Product(final Long id, final String name, final BigDecimal price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(final BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return new StringBuilder("Product{")
				.append("id=").append(id)
				.append(", name='").append(name).append('\'')
				.append(", price=").append(price)
				.append('}')
				.toString();
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) return true;
		if (!(o instanceof Product)) return false;

		Product product = (Product) o;

		if (!getId().equals(product.getId())) return false;
		if (!getName().equals(product.getName())) return false;
		return getPrice().equals(product.getPrice());
	}

	@Override
	public int hashCode() {
		int result = getId().hashCode();
		result = 31 * result + getName().hashCode();
		result = 31 * result + getPrice().hashCode();
		return result;
	}
}
