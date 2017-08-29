package a_Zadania.b_Dzien_2.b_Wzorce_projektowe;

public class VirtualProduct implements Product {

	@Override
	public int getHeight() {
		return 0;
	}

	@Override
	public String getType() {
		return "VirtualProduct";
	}

}
