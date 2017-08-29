package a_Zadania.b_Dzien_2.a_Klasy_abstrakcyjne;

import a_Zadania.b_Dzien_2.b_Interfejsy.Inspectionable;

public class Car extends Vehicle implements Inspectionable {
	private String type;

	public Car(String model, int maxSpeed, String type) {
		this.type = type;
		super.maxSpeed = maxSpeed;
		super.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void createInspection() {
		System.out.println("Model: " + model + " - sprawdzony");
	}

}
