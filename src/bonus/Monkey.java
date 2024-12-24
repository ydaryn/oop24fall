package bonus;

class Monkey extends Animal implements CanWalk, CanClimb {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey is screeching!");
    }

    @Override
    public void move() {
        System.out.println("Monkey is moving by walking and climbing.");
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
    public void climb(int height) {
        int energyCost = height * 4;
        if (hasEnergy(energyCost)) {
            energy -= energyCost;
            System.out.println(name + " climbed " + height + " meters.");
        } else {
            System.out.println(name + " is too tired to climb.");
        }
    }
}
