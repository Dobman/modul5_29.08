package a_Zadania.b_Dzien_2.b_Wzorce_projektowe.observer;

public class SubscriberObserver implements Observer {

	@Override
	public void update() {
		System.out.println("notify subscribers");
	}

}
