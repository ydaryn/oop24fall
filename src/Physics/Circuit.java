package Physics;
public abstract class Circuit {
    protected double potentialDifference; 
    public abstract double getResistance(); // evry sub must declare their value

    public double getPotentialDiff() {
        return potentialDifference;
    }

    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
    }

    public double getPower() {
        return getCurrent() * potentialDifference;
    }

    public double getCurrent() {
        return potentialDifference / getResistance();
    }
}
