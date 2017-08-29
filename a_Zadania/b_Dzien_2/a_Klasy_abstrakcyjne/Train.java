package a_Zadania.b_Dzien_2.a_Klasy_abstrakcyjne;

public class Train extends Vehicle {
	int trackWidth;

	public Train(String model, int maxSpeed, int trackWidth) {
		this.trackWidth = trackWidth;
		super.maxSpeed = maxSpeed;
		super.model = model;
	}

	public int getTrackWidth() {
		return trackWidth;
	}

	public void setTrackWidth(int trackWidth) {
		this.trackWidth = trackWidth;
	}
	
	
}
