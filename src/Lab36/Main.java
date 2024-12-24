package Lab36;

public class Main {
    public static void main(String[] args) {

    	Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        Animal animal1 = new Animal("Cat", 5);
        Animal animal2 = new Animal("Dog", 3);

        System.out.println("Comparing persons by age:");
        System.out.println(person1.compareTo(person2));  // -1, 25<30

        try {
            Animal clonedAnimal = animal2.clone();
            System.out.println("Cloned animal: " + clonedAnimal);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Human human = new Human("John", 28);
        Dog dog = new Dog("Rex", 4);

        System.out.println("\nTesting walking and swimming:");
        human.walk();
        human.swim();

        dog.walk();
        dog.swim();

        System.out.println("\nPerson details:");
        System.out.println(person1);
        System.out.println(person2);

        System.out.println("\nAnimal details:");
        System.out.println(animal1);
        System.out.println(animal2);
    }
}

