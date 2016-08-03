package pl.javadevmatt.builder.classic;

import pl.javadevmatt.builder.classic.entities.Car;

public interface CarBuilder {
	
	public void buildTires();
	
	public void buildEngine();
	
	public Car getCar();
	
}
