package petManage;

public class Fish extends Animal{
	public Fish(String name, int age) {
		super(name,age, "Fish");
	}
	
	@Override
	public String getSound() {
		return "Boolb";
	}
}
