package pro.buildmysoftware.discount.api;

import org.joda.money.Money;

public interface DiscountPolicy {

	Money applyDiscount(Order order);
}
