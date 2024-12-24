package Lab36;

public class Human extends Person implements CanWalk, CanSwim {

	public Human(String name, int age) {
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
