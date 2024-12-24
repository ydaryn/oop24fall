package petManage;

public class phdStudent extends Student {
    private String researchTopic;

    public phdStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    @Override
    public String getOccupation() {
        return "PhD Student";
    }
    
    @Override
    public void assignPet(Animal pet) {
    	if(pet instanceof Dog) {
            throw new IllegalArgumentException("PhD Students cannot have dogs."); 	
    	}
    }
}
