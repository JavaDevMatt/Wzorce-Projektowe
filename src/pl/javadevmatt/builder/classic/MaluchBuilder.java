package pl.javadevmatt.builder.classic;

import pl.javadevmatt.builder.classic.entities.Car;
import pl.javadevmatt.builder.classic.entities.Engine;
import pl.javadevmatt.builder.classic.entities.Tires;

public class MaluchBuilder implements CarBuilder{
	
	private Car car;
	
	public MaluchBuilder(){
		this.car = new Car();
	}

	@Override
	public void buildTires() {
		Tires tire = new Tires();
		tire.setDurability(100);
		tire.setType("Maluch Tires");
		
		car.setTires(tire);
	}

	@Override
	public void buildEngine() {
		Engine engine = new Engine();
		engine.setType("Maluch Engine");
		
		car.setEngine(engine);
	}

	@Override
	public Car getCar() {
		return car;
	}

}
