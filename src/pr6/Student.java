package pr6;
import java.util.Random;

public class Student extends Person implements  CanHavePizza, CanHaveRetake,CanHaveParty, Moveable, caSharePizza {
	private int hungerLvl=5;
	private int pizzaAmount=1;
	private boolean passedExam = false;
	
	public Student(String name) {
		super(name);
	}
	
	@Override
    public void addPizza(int amount) {
        pizzaAmount += amount;
        System.out.println(name + " now has " + pizzaAmount + " pizzas.");
    }
	
	@Override
    public void sharePizza(CanHavePizza eater) {
        if (this.pizzaAmount > 0) {
                int pizzaToShare = 1;
                this.pizzaAmount -= pizzaToShare;
                eater.addPizza(pizzaToShare);
                System.out.println("because " + name + " shared pizza.");
            
        } else {
            System.out.println(name + " doesn't have enough pizza to share.");
        }
    }
	
	@Override
	public void move() {
		System.out.println(name + " is moving");
		
	}

	@Override
	public void dance() {
		System.out.println(name + " can really dance");
		
	}

	@Override
	public void retakeDiscipline() {
		System.out.println(name + " is retaked discipline");

	}

	@Override
    public void eatPizza() {
        if (hungerLvl > 0 && pizzaAmount > 0) {
            System.out.println(name + " is eating pizza...");
            hungerLvl--;
            pizzaAmount--;
        } else if (pizzaAmount == 0) {
            System.out.println(name + " has no pizza left.");
        } else {
            System.out.println(name + " is full and refuses more pizza.");
        }
    }

	public void takeExam(int numm) {
		Random rand = new Random();
        int[] randomNumbers = new int[5];
        for (int i = 0; i < 5; i++) {
            randomNumbers[i] = rand.nextInt(10) + 1;
        }


        for (int num : randomNumbers) {
            if (num == numm) {
                passedExam = true;
                pizzaAmount++;
                System.out.println(name + " passed the exam and got a pizza!");
                return;
            }
        }

        passedExam = false;
        retakeDiscipline();
    }
	
	@Override
	public int getHungerLvl() {
		return hungerLvl;
	}
	
	@Override
	public String getPizzaAmount() {
		return name+ " has " +pizzaAmount+" pizza(-s)";
	}
	
	@Override
	public void breathe() {
		System.out.println(name+ " is breathing");
	}
	

}
