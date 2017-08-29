package pl.coderslab;

public class Car extends Vehicle {

	private String type;
	
	public Car(int maxSpeed, String model, String type) {
		super(maxSpeed, model);
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
