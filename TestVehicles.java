package oca.samples;

public class TestVehicles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Van myVan = new Van("Volvo", "XC60", 7);
		System.out.println(myVan.make);
		System.out.println(myVan.model);
		System.out.println(myVan.seats);

	}

}

class Vehicle {
	String make;
	String model;

	Vehicle() {

	}

	public Vehicle(String vMake, String vModel) {
		make = vMake;
		model = vModel;
	}

}

class Van extends Vehicle {
	int seats;

	public Van(String make, String model, int vSeats) {
		Vehicle vehicle = new Vehicle(make, model);
		seats = vSeats;
	}
}