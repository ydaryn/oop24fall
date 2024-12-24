package pr6;

interface CanHavePizza {
	int PIZZASIZE=10;
	void eatPizza();
	int getHungerLvl();
	String getPizzaAmount();
	void addPizza(int amount);
	void sharePizza(CanHavePizza receiver);
}
