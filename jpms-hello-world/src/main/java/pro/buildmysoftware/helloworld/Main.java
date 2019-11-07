package pro.buildmysoftware.helloworld;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class Main {

	public static void main(String[] args) {
		Money a = Money.of(CurrencyUnit.AUD, 1);
		System.out.println(String.valueOf(a.getAmount()));
		System.out.println("Hello World from module: " + Main.class
			.getModule());
	}
}
