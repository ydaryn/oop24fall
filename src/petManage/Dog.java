package petManage;

public class Dog extends Animal{
	public Dog(String name, int age) {
		super(name,age, "Dog");
	}
	
	@Override
	public String getSound() {
		return "Woof";
	}
}
