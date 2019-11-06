package pro.buildmysoftware.discount.impl;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import pro.buildmysoftware.discount.api.DiscountPolicy;
import pro.buildmysoftware.discount.api.Order;

public class ThresholdDiscountPolicy implements DiscountPolicy {

	@Override
	public Money applyDiscount(Order order) {
		Money orderCost = order.cost();
		if (orderCost.isGreaterThan(Money.of(CurrencyUnit.USD, 500))) {
			return new Discount(0.05).apply(order);
		}
		else if (order.cost()
			.isGreaterThan(Money.of(CurrencyUnit.USD, 1000))) {
			return new Discount(0.1).apply(order);
		}
		else {
			return new Discount(0).apply(order);
		}
	}
}
