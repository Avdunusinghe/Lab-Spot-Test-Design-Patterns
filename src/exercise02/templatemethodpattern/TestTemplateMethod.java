package exercise02.templatemethodpattern;

public class TestTemplateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverages tea = new Tea();
		tea.prepareRecipie();
		System.out.println("=========================");
		Beverages coffie = new Coffee();
		coffie.prepareRecipie();
	}

}
