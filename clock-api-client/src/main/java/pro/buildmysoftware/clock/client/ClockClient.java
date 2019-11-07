package pro.buildmysoftware.clock.client;

import pro.buildmysoftware.clock.api.ClockApiProvider;

import java.time.Clock;
import java.time.LocalDate;

public class ClockClient {

	public static void main(String[] args) {
		Clock clock = ClockApiProvider.getInstance();

		System.out.println("Current date: " + LocalDate.now(clock));
	}
}
