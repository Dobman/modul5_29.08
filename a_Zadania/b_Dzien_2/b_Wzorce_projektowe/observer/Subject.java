package a_Zadania.b_Dzien_2.b_Wzorce_projektowe.observer;

public interface Subject {
	void attach(Observer observer);

	void detach(Observer observer);

	void notifyObservers();
}
