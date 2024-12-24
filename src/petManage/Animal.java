package petManage;

public abstract class Animal {
	private String name;
	private int age;
	private String type;
	
	public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }
	
	public abstract String getSound(); //will be overridden 
	public String toString() {
		return "Name: "+name+", Age: "+ age+", Sound: "+getSound()+", Type: " + type;
	}
}