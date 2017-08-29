package pl.coderslab;

public class Client extends User {

	public Client(String username, String password, int age) {
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
		if (age > 18 && password.length() >= 10) {
			super.password = password;
			return true;
		}
		
		return false;
	}

	@Override
	public void setAge(int age) {
		super.age = age;
	}

}
