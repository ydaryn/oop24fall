package bonus;

class Fish extends Animal implements CanSwim {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Fish is silent.");
    }

    @Override
    public void move() {
        System.out.println("Fish is moving by swimming.");
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
