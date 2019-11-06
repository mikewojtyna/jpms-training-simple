package pro.buildmysoftware.open.user;

import java.time.LocalDate;
import java.util.Objects;

public class User {

	private final String username;
	private final LocalDate birthDate;

	public User(String username, LocalDate birthDate) {
		this.username = username;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User{" + "username='" + username + '\'' + ", birthDate"
			+ "=" + birthDate + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		User user = (User) o;
		return Objects.equals(username, user.username) && Objects
			.equals(birthDate, user.birthDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, birthDate);
	}
}
