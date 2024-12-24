package bonus;

class Bird extends Animal implements CanFly, CanWalk {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird is tweeting!");
    }

    @Override
    public void move() {
        System.out.println("Bird is moving by flying.");
    }

    @Override
    public void fly(int distance) {
        int energyCost = distance * 5;
        if (hasEnergy(energyCost)) {
            energy -= energyCost;
            System.out.println(name + " flew " + distance + " meters.");
        } else {
            System.out.println(name + " is too tired to fly.");
        }
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
}