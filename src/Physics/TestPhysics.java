package Physics;
public class TestPhysics {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);
        
        Circuit f = new Series(a, b);
        Parallel g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);
        
        double V = 12.0; // Example potential difference
        circuit.applyPotentialDiff(V);
        double R = circuit.getResistance();
        double current = circuit.getCurrent();
        double power = circuit.getPower();

        System.out.println("Equivalent Resistance: " + R + " Ohms");
        System.out.println("Current: " + current + " Amperes");
        System.out.println("Power: " + power + " Watts");
    }
}