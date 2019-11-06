package pro.buildmysoftware.discountpolicyconsumer;

import org.joda.money.Money;
import pro.buildmysoftware.discount.api.DiscountPolicy;
import pro.buildmysoftware.discount.api.DiscountPolicyFactory;
import pro.buildmysoftware.discount.api.Order;

public class DiscountPolicyConsumer {

	public static void main(String[] args) {
		DiscountPolicy discountPolicy =
			DiscountPolicyFactory.provide();
		Order order = new Order();
		Money afterDiscount = discountPolicy.applyDiscount(order);
		System.out.println("After discount: " + afterDiscount);
	}
}
