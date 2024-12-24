package bonus;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Parrot", 2);
        bird.makeSound();
        bird.move();
        bird.sleep();
        bird.eat(10);
        bird.fly(5);
        bird.walk(3);
        System.out.println("Bird's remaining energy: " + bird.energy);

        System.out.println(" ");
        
        Fish fish = new Fish("Goldfish", 1);
        fish.makeSound();
        fish.move();
        fish.sleep();
        fish.eat(5);
        fish.swim(10);
        System.out.println("Fish's remaining energy: " + fish.energy);

        System.out.println(" ");

        Monkey monkey = new Monkey("Chimpanzee", 5);
        monkey.makeSound();
        monkey.move();
        monkey.sleep();
        monkey.eat(15);
        monkey.walk(5);
        monkey.climb(2);
        System.out.println("Monkey's remaining energy: " + monkey.energy);

        System.out.println(" ");

        Dog dog = new Dog("Bulldog", 4);
        dog.makeSound();
        dog.move();
        dog.sleep();
        dog.eat(20);
        dog.walk(10);
        dog.swim(4);
        System.out.println("Dog's remaining energy: " + dog.energy);
    }
}