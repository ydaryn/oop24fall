package bonus;
class Dog extends Animal implements CanWalk, CanSwim {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking!");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving by walking.");
    }

    @Override
    public void walk(int distance) {
        int energyCost = distance * 2;
        if (hasEnergy(energyCost)) {
            energy -= energyCost;
            System.out.println(name + " walked " + distance + " meters.");
        } else {
            System.out.println(name + " is too tired to walk.");
        }
    }

    @Override
    public void swim(int distance) {
        int energyCost = distance * 3;
        if (hasEnergy(energyCost)) {
            energy -= energyCost;
            System.out.println(name + " swam " + distance + " meters.");
        } else {
            System.out.println(name + " is too tired to swim.");
        }
    }
}