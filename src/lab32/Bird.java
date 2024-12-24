package lab32;

public class Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("Bird is flying");
	}
	
	@Override
	public void move() {
		System.out.println("Bird is moving");
	}

}
