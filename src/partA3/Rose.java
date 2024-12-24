package partA3;
import java.util.Objects;

public class Rose extends Flower {
	private int thorns;
	
	public int getThorns() {
		return thorns;
	}

	public void setThorns(int thorns) {
		this.thorns = thorns;
	}

	public Rose(String name, int age, String color, int thorns) {
		super(name,age,color);
		this.thorns=thorns;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), thorns);
	}
	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj)) {
			return false;
		}
		Rose other=(Rose) obj;
		return thorns==other.thorns;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Thorns: "+thorns;
	}
}