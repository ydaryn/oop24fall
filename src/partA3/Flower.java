package partA3;

import java.util.Objects;

public class Flower {
	private String name;
	private int age; //in days as an id
	private String color;

	public Flower(String name, int age,String color) {
		this.name=name;
		this.age=age;
		this.color=color;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
	
	public void setName(String name) {
        this.name = name;
    }
	public void setAge(int age) {
		this.age=age;
	}
    public void setColor(String color) {
        this.color = color;
    }
    
    //https://www.youtube.com/watch?v=ZcZQEqxmjOQ
    
    @Override
	public int hashCode() {
		return Objects.hash(null);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;   //один и тот же объект в памяти.
		}
		if (obj == null) {
			return false;  //no null
		}
		if (getClass() != obj.getClass()) {
			return false;   // in one class
		}
		Flower other = (Flower) obj; //говорим что обж теперь типа цветы а не общего класса обджект
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(name, other.name);
	}

	@Override
    public String toString() {
    	return "Name: "+name+" Age: "+age+ " Color: " +color;
    }
    
    
    
}
