package lab34;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee implements Comparable<Employee> {

    private double bonus;
    private Vector<Employee> team;

    public Manager(String name, double annualSalary, Date hireDate, String nationalInsuranceNumber, double bonus) {
        super(name, annualSalary, hireDate, nationalInsuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    public void setTeam(Vector<Employee> team) {
        this.team = team;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Manager manager = (Manager) obj;
        return Double.compare(manager.bonus, bonus) == 0;
    }

    @Override
    public String toString() {
        return "Manager{" +
               "name='" + getName() + "', " +
               "annualSalary=" + getAnnualSalary() + ", " +
               "hireDate=" + getHireDate() + ", " +
               "nationalInsuranceNumber='" + getNationalInsuranceNumber() + "', " +
               "bonus=" + bonus + "}";
    }

    @Override
    public Manager clone() {
        Manager clonedManager = new Manager(getName(), getAnnualSalary(), (Date) getHireDate().clone(), getNationalInsuranceNumber(), bonus);
        clonedManager.setTeam(new Vector<>(team));
        return clonedManager;
    }

    // compareTo for sorting
    @Override
    public int compareTo(Employee other) {
        // by salary
        int salaryComparison = Double.compare(this.getAnnualSalary(), other.getAnnualSalary());
        if (salaryComparison != 0) {
            return salaryComparison;
        }
        // by bonus (for managers)
        if (this instanceof Manager && other instanceof Manager) {
            Manager thisManager = (Manager) this;
            Manager otherManager = (Manager) other;
            return Double.compare(thisManager.getBonus(), otherManager.getBonus());
        }
        return 0; 
    }
}
