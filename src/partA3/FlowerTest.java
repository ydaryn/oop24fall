package partA3;

public class FlowerTest {
    public static void main(String[] args) {
        Rose rose1 = new Rose("Rose", 3, "Red", 5);
        Rose rose2 = new Rose("Rose", 3, "Red", 5);
        Rose rose3 = new Rose("Rose", 4, "Pink", 3);

        // equals
        System.out.println("rose1 equals rose2: " + rose1.equals(rose2)); 
        System.out.println("rose1 equals rose3: " + rose1.equals(rose3)); 

        //hashCode()
        System.out.println("Hash code of rose1: " + rose1.hashCode());
        System.out.println("Hash code of rose2: " + rose2.hashCode());
        System.out.println("Hash code of rose3: " + rose3.hashCode());

        }
    }

