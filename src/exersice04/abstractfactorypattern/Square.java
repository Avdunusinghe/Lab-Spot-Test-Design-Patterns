package exersice04.abstractfactorypattern;

public class Square implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Square::draw() method");
		System.out.println("#########");
		System.out.println("#       #");
		System.out.println("#       #");
		System.out.println("#       #");
		System.out.println("#########");
	}

}
