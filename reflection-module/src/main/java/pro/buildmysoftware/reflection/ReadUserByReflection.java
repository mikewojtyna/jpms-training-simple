package pro.buildmysoftware.reflection;

import pro.buildmysoftware.open.factory.UserFactory;

import java.lang.reflect.Field;

public class ReadUserByReflection {

	public static void main(String[] args) throws Exception {
		Object goobar = UserFactory.createUser("goobar");
		Field usernameField = goobar.getClass()
			.getDeclaredField("username");
		usernameField.setAccessible(true);
		String username = (String) usernameField.get(goobar);
		System.out.println("Username: " + username);
	}
}
