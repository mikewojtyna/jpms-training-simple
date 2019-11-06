package pro.buildmysoftware.discount.api;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class Order {

	public Money cost() {
		return Money.zero(CurrencyUnit.USD);
	}
}
