package pro.buildmysoftware.open.factory;

import pro.buildmysoftware.open.user.User;

import java.time.LocalDate;

public class UserFactory {

	public static Object createUser(String username) {
		return new User(username, LocalDate.now());
	}
}
