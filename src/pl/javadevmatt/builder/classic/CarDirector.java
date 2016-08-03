package pl.javadevmatt.builder.classic;

import pl.javadevmatt.builder.classic.entities.Car;

public class CarDirector {
	
	private CarBuilder carBuilder;
	
	public CarDirector(CarBuilder carBuilder){
		this.carBuilder = carBuilder;
	}
	
	public void makeCar(){
		carBuilder.buildTires();
		carBuilder.buildEngine();
	}
	
	public Car getCar(){
		return this.carBuilder.getCar();
	}
	
}
