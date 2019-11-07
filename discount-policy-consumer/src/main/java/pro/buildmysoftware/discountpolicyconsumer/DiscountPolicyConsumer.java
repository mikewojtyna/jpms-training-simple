package pro.buildmysoftware.discountpolicyconsumer;

//import org.joda.money.Money;
import org.joda.money.Money;
import pro.buildmysoftware.discount.api.DiscountPolicy;
import pro.buildmysoftware.discount.api.DiscountPolicyFactory;
import pro.buildmysoftware.discount.api.Order;
// cannot import cause not in module info
//import pro.buildmysoftware.discount.impl.FlatDiscountPolicy;

public class DiscountPolicyConsumer {

	public static void main(String[] args) {
//		FlatDiscountPolicy f = FlatDiscountPolicy();
		DiscountPolicy discountPolicy =
			DiscountPolicyFactory.provide();
		Order order = new Order();
		// if not transitive then could not use money as it is nested in our export
		// could also use var instead money, and ide will help but will raise compilation error
		Money afterDiscount = discountPolicy.applyDiscount(order);
		System.out.println("After discount: " + afterDiscount.getAmount());
	}
}
