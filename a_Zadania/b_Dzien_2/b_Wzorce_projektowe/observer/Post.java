package a_Zadania.b_Dzien_2.b_Wzorce_projektowe.observer;

import java.util.ArrayList;
import java.util.List;

public class Post implements Subject {

	private List<Observer> observers;

	public Post() {
		observers = new ArrayList<Observer>();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
