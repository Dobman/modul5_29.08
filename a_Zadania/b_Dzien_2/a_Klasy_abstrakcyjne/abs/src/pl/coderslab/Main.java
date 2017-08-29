package pl.coderslab;

public class Main {

	public static void main(String[] args) {
		// Vehicle[] vehicles = { new Car(200, "Duzy Fiat 125p", "Quasi samochod"),
		// new Train(220, "Lokomotywa Parowa", 600) };
		//
		// for(Vehicle vehicle : vehicles) {
		// System.out.println(vehicle.toString());
		// }

		Client client = new Client("MrX", "tajnehaslo", 18);
		Admin admin = new Admin("admin", "tajnehaslo", 18);
		
		System.out.println(client.login("MrX", "tajnehaslo"));
		System.out.println(admin.login("admin", "tajnehaslo"));
	}

}
