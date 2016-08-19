package pl.javadevmatt.observer;

import java.util.ArrayList;

import pl.javadevmatt.observer.interfaces.Observer;
import pl.javadevmatt.observer.interfaces.Subject;

public class YTChannel implements Subject{
	
	private ArrayList<Observer> observerList;
	
	public  YTChannel() {
		observerList = new ArrayList<>();
	}
	
	public void publishNewVideo(){
		System.out.println("YTChannel: Publisching new video.");
        notifyObservers();
    }

	@Override
	public void register(Observer o) {
		observerList.add(o);
	}

	@Override
	public void unregister(Observer o) {
		observerList.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observerList){
			o.update();
		}
	}

}
