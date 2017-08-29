package pl.coderslab;

public abstract class Vehicle {
	private int maxSpeed;
	private String model;

	public Vehicle(int maxSpeed, String model) {
		super();
		this.maxSpeed = maxSpeed;
		this.model = model;
	}

	public String toString() {
		return "Class : " + Vehicle.class.getName() + ", model: " + model + ", speed:" + maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
