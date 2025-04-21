package chap08.section02.example02;

public class DriverApplication {
	
	public static void drive(Vehicle vehicle) {
		vehicle.run();
	}
	
    public static void main(String[] args) {

        Bus bus   = new Bus();
        Taxi taxi = new Taxi();

        drive(bus);     
        drive(taxi);    
    }
}
