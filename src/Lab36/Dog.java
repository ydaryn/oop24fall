package Lab36;

public class Dog extends Animal implements CanWalk, CanSwim {

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void walk() {
		System.out.println(getName() + " is walking!");
	}

	@Override
	public void swim() {
		System.out.println(getName() + " is swimming!");
	}


}
