package pr6;

class Restaurant {
    boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();
        
        if (eater instanceof Person) {
            System.out.println("Processing payment for " + ((Person) eater).name);
            return true;
        }
        return false;
    }


}
