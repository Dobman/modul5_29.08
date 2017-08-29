package a_Zadania.b_Dzien_2.b_Wzorce_projektowe;

import a_Zadania.b_Dzien_2.b_Wzorce_projektowe.facade.AtmApi;
import a_Zadania.b_Dzien_2.b_Wzorce_projektowe.observer.FacebookObserver;
import a_Zadania.b_Dzien_2.b_Wzorce_projektowe.observer.Observer;
import a_Zadania.b_Dzien_2.b_Wzorce_projektowe.observer.Post;
import a_Zadania.b_Dzien_2.b_Wzorce_projektowe.observer.PublishSubscriber;
import a_Zadania.b_Dzien_2.b_Wzorce_projektowe.observer.SubscriberObserver;

public class Main2 {

	public static void main(String[] args) {
		AppConfig appConfig = AppConfig.getInstance();
		System.out.println("AppConfig host: " + appConfig.getHost() + ", port: " + appConfig.getPort() + ", timeout: "
				+ appConfig.getTimeout());

		Factory productFactory = new ProductFactory();
		Product simpleProduct = productFactory.getProduct("SimpleProduct");
		System.out.println(simpleProduct.getType());
		Product advanceProduct = productFactory.getProduct("AdvanceProduct");
		System.out.println(advanceProduct.getType());
		Product virtualProduct = productFactory.getProduct("VirtualProduct");
		System.out.println(virtualProduct.getType());

		AtmApi atmApi = new AtmApi();
		atmApi.deposit();

		Post post = new Post();
		Observer facebookObserver = new FacebookObserver();
		Observer publishSubscriber = new PublishSubscriber();
		Observer subscriberObserver = new SubscriberObserver();
		post.attach(facebookObserver);
		post.attach(publishSubscriber);
		post.attach(subscriberObserver);
		post.notifyObservers();
		
	}

}
