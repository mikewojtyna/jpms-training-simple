package pro.buildmysoftware.discount.api;

import pro.buildmysoftware.discount.impl.FlatDiscountPolicy;

public class DiscountPolicyFactory {

	public static DiscountPolicy provide() {
		return new FlatDiscountPolicy();
	}
}
