
public class Vehicle {

	public void run() {
		System.out.println(" Car is running");
	}

	class Bike extends Vehicle {

		public void run() {
			System.out.println("Bike is running");
		}
	}

	public static void main(String[] args) {
		Vehicle vl = new Vehicle();
		vl.run();
	}

}
