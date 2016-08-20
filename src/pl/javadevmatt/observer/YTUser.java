package pl.javadevmatt.observer;

import pl.javadevmatt.observer.interfaces.Observer;

public class YTUser implements Observer{
	
	private String name;
	private int videosToWatch;
	
	public YTUser(String name) {
		this.name = name;
		videosToWatch = 0;
	}
	
	@Override
	public void update() {
		videosToWatch++;
		System.out.println("Hey " + name + "! There is a new video! You have " + videosToWatch + " videos to watch.");
	}

}
