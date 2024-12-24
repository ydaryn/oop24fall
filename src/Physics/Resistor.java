package Physics;

public class Resistor extends Circuit{
	private double resistance;
	
	public Resistor(double resistance) {
        this.resistance = resistance;
    }
	
	@Override
	public double getResistance() {
		return resistance;
	}
}
