package pl.javadevmatt.builder.classic;

import pl.javadevmatt.builder.classic.entities.Car;

public class Client {
	
	public static void main(String[] args){
		
		CarBuilder carBuilder = new RaceCarBuilder();
		CarDirector carDirector = new CarDirector(carBuilder);
		carDirector.makeCar();
		
		Car car = carDirector.getCar();
		System.out.println(car);
	}
	

}
