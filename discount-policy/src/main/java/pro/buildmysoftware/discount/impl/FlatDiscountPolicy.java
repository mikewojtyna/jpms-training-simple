package pro.buildmysoftware.discount.impl;

import org.joda.money.Money;
import pro.buildmysoftware.discount.api.DiscountPolicy;
import pro.buildmysoftware.discount.api.Order;

public class FlatDiscountPolicy implements DiscountPolicy {

	@Override
	public Money applyDiscount(Order order) {
		return new Discount(0.1).apply(order);
	}
}
