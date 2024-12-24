package petManage;

import java.util.Objects;

public abstract class Person {
	private String name;
    private int age;
    protected Animal pet;
    
    public Person(String name, int age) {
    	this.name=name;
    	this.age=age;
    	this.pet = null;
    }
    
    
    @Override
	public int hashCode() {
		return Objects.hash(age, name, pet);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(pet, other.pet);
	}


	public void assignPet(Animal pet) {
	    if (this.pet == null || !this.pet.equals(pet)) {
	        this.pet = pet;
	    } else {
	        System.out.println("This pet is already assigned to this person.");
	    }
	}

    
    public Animal removePet() {
    	Animal removedPet=this.pet;
    	this.pet=null;
    	return removedPet;
    }
    
    public boolean hasPet() {
    	return pet!=null;
    }
    
    public abstract String getOccupation();
    
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", occupation='" + getOccupation() + "', pet=" + (pet != null ? pet.toString() : "None") + "}";
    }
}
