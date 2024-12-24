package Physics;

public class Series extends Circuit{
	private Circuit c1;
	private Circuit c2;
	
	public Series(Circuit c1, Circuit c2) {
		this.c1=c1;
		this.c2=c2;
	}
	
	@Override
	public double getResistance() {
		return c1.getResistance()+c2.getResistance(); //Если circuit1 — это Resistor: return значение, равное сопротивлению резистора. Polym
	}
}
