package pl.javadevmatt.builder.classic.entities;


public class Car {
	
	private Tires tires;
	
	private Engine engine;
	
	public Tires getTires() {
		return tires;
	}

	public void setTires(Tires tires) {
		this.tires = tires;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [tires=" + tires + ", engine=" + engine + "]";
	}
	
}
