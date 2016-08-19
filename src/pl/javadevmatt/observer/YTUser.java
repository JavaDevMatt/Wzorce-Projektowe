package pl.javadevmatt.observer;

import pl.javadevmatt.observer.interfaces.Observer;

public class YTUser implements Observer{
	
	private String name;
	
	public YTUser(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		System.out.println("Hey " + name + "! There is a new video!");
	}

}
