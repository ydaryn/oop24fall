package pr6;

public class Cat extends Animal implements CanHavePizza, caSharePizza {
	private int hungerLvl=5;
	private int pizzaAmount = 1;
	
	public Cat(String name) {
		super(name);
	}
	

	public void eatPizza() {
        if (hungerLvl > 0 && pizzaAmount > 0) {
            System.out.println("Cat is eating pizza...");
            hungerLvl--;
            pizzaAmount--;
        } else if (pizzaAmount == 0) {
            System.out.println("Cat has no pizza left.");
        } else {
            System.out.println("Cat is full and refuses more pizza.");
        }
    }
	    
	@Override
    public void sharePizza(CanHavePizza eater) {
        if (pizzaAmount > 0) {
                int pizzaToShare = 1;
                this.pizzaAmount -= pizzaToShare;
                eater.addPizza(pizzaToShare);
                System.out.println("because "+name +" shared pizza");
            
        } else {
            System.out.println("Cat doesn't have enough pizza to share.");
        }
    }
	
	@Override
	void breathe() {
		System.out.println("Cat is breathing.");
	}
	
	@Override
	public int getHungerLvl() {
		return hungerLvl;
	}
	
	@Override
    public void addPizza(int amount) {
        pizzaAmount += amount;
        System.out.println("Cat now has " + pizzaAmount + " pizzas.");
    }
	
	@Override
	public String getPizzaAmount() {
		return name+ " has " + pizzaAmount + " pizza(-s)";
	}
	
	public void walk(int distance) {
        int pizzasGained = distance / 2;
        pizzaAmount += pizzasGained;
        System.out.println("Cat walked " + distance + " km and earned " + pizzasGained + " pizza(s).");
    }
}
