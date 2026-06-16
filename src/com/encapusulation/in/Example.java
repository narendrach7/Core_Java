package com.encapusulation.in;

class InvalidAgeOfVehicleException extends Exception{
	public InvalidAgeOfVehicleException(String message) {
		super(message);
	}
}

class InvalidAgeOfTireException extends Exception{
	public InvalidAgeOfTireException(String message) {
		super(message);
	}
}

class InvalidAgeOfEngineException extends Exception{
	public InvalidAgeOfEngineException(String message) {
		super(message);
	}
}

class vehicle{
	public void checkage(int ageOfVehicle,int ageOfTire,int ageOfEngine)throws InvalidAgeOfVehicleException,InvalidAgeOfTireException,InvalidAgeOfEngineException{
		if(ageOfVehicle>10) {
			throw new InvalidAgeOfVehicleException("Change the vehicle...");
		}else if(ageOfTire>2) {
			throw new InvalidAgeOfTireException("Change the Tire");
		}else if(ageOfEngine>15) {
			throw new InvalidAgeOfEngineException("Change the vehicle");
		}else {
			System.out.println("you can use this vehicle");
		}
	}
}

public class Example {

	public static void main(String[] args) {
		try {
			new vehicle().checkage(10,20, 15);
		}catch(InvalidAgeOfVehicleException e) {
			e.printStackTrace();
		}catch(InvalidAgeOfTireException e) {
			e.printStackTrace();
		}catch(InvalidAgeOfEngineException e) {
			e.printStackTrace();
		}   
		System.out.println("vehicle");

	}

}
