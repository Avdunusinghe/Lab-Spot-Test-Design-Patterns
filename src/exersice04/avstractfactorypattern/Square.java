package exersice04.avstractfactorypattern;

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
