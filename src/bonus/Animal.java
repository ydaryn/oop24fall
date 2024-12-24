package bonus;

public abstract class Animal {
	protected String name;
    protected int age;
    protected int energy=100;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 100;
    }

    public abstract void makeSound();

    public abstract void move();

    public void sleep() {
        energy += 20;
        System.out.println(name + " is sleeping and gaining energy.");
    }

    public void eat(int foodEnergy) {
        energy += foodEnergy;
        System.out.println(name + " is eating and gaining " + foodEnergy + " energy.");
    }

    protected boolean hasEnergy(int cost) {
        return energy >= cost;
    }
}
