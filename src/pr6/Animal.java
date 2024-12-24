package pr6;

abstract class Animal {
	public String name;
	public Animal(String name) {
		this.name = name;
	}

	abstract void breathe();
}
