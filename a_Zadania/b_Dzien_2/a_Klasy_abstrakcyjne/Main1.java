package a_Zadania.b_Dzien_2.a_Klasy_abstrakcyjne;

import a_Zadania.b_Dzien_2.b_Interfejsy.Inspectionable;

public class Main1 {

	public static void main(String[] args) {
		Vehicle [] vehicles = {new Car("Ferrari", 260, "Sport Car"), new Train("Steam Train", 220, 600)};
		for(Vehicle vehicle : vehicles){
			System.out.println(vehicle.toString());
			if(vehicle instanceof Inspectionable){
				((Inspectionable) vehicle).createInspection();
			}
		}

	}

}
