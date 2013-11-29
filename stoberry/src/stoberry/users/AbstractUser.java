package stoberry.users;

import java.util.Date;

public abstract class AbstractUser {

	private String name;

	private String password;

	private String username;

	private String email;

	private Date birthday;

	public boolean loggedIn;

	private AbstractUser abstractUser;

	private AbstractUser abstractUser;

	public void setName(String name) {

	}

	public String getName() {
		return null;
	}

	public void setPassword(String password) {

	}

	public String getPassword() {
		return null;
	}

	public void setUsername(String username) {

	}

	public String getUsername() {
		return null;
	}

	public void setEmail(String email) {

	}

	public String getEmail() {
		return null;
	}

	public void setBirthday(Date birthday) {

	}

	public Date getBirthday() {
		return null;
	}

	public boolean verifyPassword(String password) {
		return false;
	}

	public AbstractUser(String name, String password, String username, String email, Date birthday) {

	}

}
