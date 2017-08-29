package a_Zadania.b_Dzien_2.b_Wzorce_projektowe;

public class ProductFactory implements Factory {

	@Override
	public Product getProduct(String type) {
		Product product = null;

		switch (type) {
		case "SimpleProduct":
			product = new SimpleProduct();
			break;
		case "AdvanceProduct":
			product = new AdvanceProduct();
			break;
		case "VirtualProduct":
			product = new VirtualProduct();
			break;
		}

		return product;
	}

}
