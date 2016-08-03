package pl.javadevmatt.builder.classic;

import pl.javadevmatt.builder.classic.entities.Car;
import pl.javadevmatt.builder.classic.entities.Engine;
import pl.javadevmatt.builder.classic.entities.Tires;

public class RaceCarBuilder implements CarBuilder{
	
	private Car car;
	
	public RaceCarBuilder(){
		this.car = new Car();
	}
	
	@Override
	public void buildEngine() {
		Engine engine = new Engine();
		engine.setType("v8");
		
		car.setEngine(engine);;
	}

	@Override
	public void buildTires() {
		Tires tire = new Tires();
		tire.setDurability(50);
		tire.setType("Slicks");
		
		car.setTires(tire);
	}

	@Override
	public Car getCar() {
		return car;
	}

}
