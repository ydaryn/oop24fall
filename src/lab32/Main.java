package lab32;

public class Main {

	public static void main(String[] args) {
		Moveable mycar= new Car();
		mycar.move();
		
		Flyable mybird= new Bird();
		mybird.fly();
		mybird.move();
	}
	
}
