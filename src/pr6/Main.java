package pr6;

public class Main {
    public static void main(String[] args) {
        Restaurant delpapa = new Restaurant();
        
        Cat kitty = new Cat("Kitty");
        delpapa.servePizza(kitty);
        
        Student john = new Student("John");
        delpapa.servePizza(john);
        john.retakeDiscipline(); 
        
        john.sharePizza(kitty);
        john.addPizza(3); 

        kitty.addPizza(2); 
        kitty.sharePizza(john); 
        
        kitty.walk(5); 
        john.takeExam(6);
        
        john.sharePizza(kitty);
        
        john.getPizzaAmount();
        kitty.getPizzaAmount();
        
        john.breathe();
    }
}