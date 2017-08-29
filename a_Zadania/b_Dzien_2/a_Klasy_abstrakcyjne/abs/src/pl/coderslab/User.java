package pl.coderslab;

abstract public class User {
	protected String username;
	protected String password;
	protected int age;

	abstract public boolean checkLogin(String username, String password);

	abstract public boolean setPassword(String password);

	public void setUsername(String login) {
		this.username = login;
	}

	abstract public void setAge(int age);

	final public boolean login(String username, String password) {
		return checkLogin(username, password);
	}
}
