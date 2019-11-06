package pro.buildmysoftware.discount.impl;

import org.joda.money.Money;
import pro.buildmysoftware.discount.api.Order;

import java.math.RoundingMode;

public class Discount {

	private double discount;

	public Discount(double discount) {
		this.discount = discount;
	}

	public Money apply(Order order) {
		return order.cost()
			.multipliedBy(1.0 - discount, RoundingMode.HALF_EVEN);
	}
}
