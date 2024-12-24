package petManage;

public class Bird extends Animal{
	public Bird(String name, int age) {
		super(name,age, "Bird");
	}
	
	@Override
	public String getSound() {
		return "Tweet";
	}
}
