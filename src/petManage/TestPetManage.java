package petManage;

public class TestPetManage {
    public static void main(String[] args) {
        PersonRegistry registry = new PersonRegistry();

        Employee emp = new Employee("John", 30, "IT");
        Student stu = new Student("Jane", 20, "Biology");
        phdStudent phdStu = new phdStudent("Alice", 28, "Astrophysics", "Black Holes");

        registry.addPerson(emp);
        registry.addPerson(stu);
        registry.addPerson(phdStu);

        Animal cat = new Cat("Whiskers", 2);
        Animal dog = new Dog("Buddy", 3);
        Animal bird = new Bird("Tweety", 1);
        Animal fish = new Fish("Nemo", 1);

        emp.assignPet(dog);
        stu.assignPet(cat);

        // PhD students cannot have dogs
        try {
            phdStu.assignPet(dog);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        registry.printDetails();
    }
}
