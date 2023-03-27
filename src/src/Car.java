package src;

public class Car {

	 
	    private boolean Running;

	    public Car(String carMake, String carModel, int carYear) {
	        
	    }

	    public void start() {
	        if (!Running) {
	            Running = true;
	            System.out.println("The car is started");
	        } else {
	            System.out.println("The car is already running");
	        }
	    }

	    public void stop() {
	        if (Running) {
	            Running = false;
	            System.out.println("The car is stopped");
	        } else {
	            System.out.println("The car is already stopped");
	        }
}
}
