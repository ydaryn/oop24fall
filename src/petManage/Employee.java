package petManage;

public class Employee extends Person {
    private String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public String getOccupation() {
        return "Employee";
    }
}
