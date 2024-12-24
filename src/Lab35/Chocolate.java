package Lab35;

public class Chocolate implements Comparable<Chocolate> {
    private String name;
    private double weight;

    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Chocolate{name='" + name + "', weight=" + weight + "}";
    }

    @Override
    public int compareTo(Chocolate other) {
        return Double.compare(this.weight, other.weight);
        };
    

    public static void main(String[] args) {
        Chocolate ch1 = new Chocolate("Twix", 55.5);
        Chocolate ch2 = new Chocolate("Snickers", 50.0);
        Chocolate ch3 = new Chocolate("KitKat", 45.3);

        System.out.println("Comparing chocolates:");
        System.out.println(ch1.compareTo(ch2));  // 1 because Twix is greater than Snickers
        System.out.println(ch1.compareTo(ch3));  // 1 because Twix is greater than KitKat
    }
}
