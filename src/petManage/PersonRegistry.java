package petManage;
import java.util.ArrayList;
import java.util.List;
public class PersonRegistry  {
	private List<Person>people;
	public PersonRegistry() {
		this.people=new ArrayList<>();
	}
	
	public void addPerson(Person p) {
		people.add(p);
	}
	
	public void removePerson(Person p) {
		people.remove(p);
	}
	
	public List<Person> PeopleWithPet() {
		List<Person> peopleWithPet=new ArrayList<>();
		for(Person p: people) {
			if(p.hasPet())  peopleWithPet.add(p);
		}
		return peopleWithPet;
	}

	public List<Person> PeopleWithoutPet() {
		List<Person> peopleWithoutPet=new ArrayList<>();
		for(Person p: people) {
			if(!p.hasPet())  peopleWithoutPet.add(p);
		}
		return peopleWithoutPet;
	}
	
	public void printDetails() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

}

