package pl.coderslab;

public class Admin extends User {

	public Admin(String username, String password, int age) {
		super.username = username;
		super.password = password;
		super.age = age;
	}

	@Override
	public boolean checkLogin(String username, String password) {
		return super.username.equals(username) && super.password.equals(password);
	}

	@Override
	public boolean setPassword(String password) {
		super.password = password;
		return age > 0 && password.length() >= 10;
	}

	@Override
	public void setAge(int age) {
		super.age = age;
	}

}
