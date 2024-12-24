package lab34;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double annualSalary;
    private Date hireDate;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, Date hireDate, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Double.compare(employee.annualSalary, annualSalary) == 0 &&
               Objects.equals(hireDate, employee.hireDate) &&
               Objects.equals(nationalInsuranceNumber, employee.nationalInsuranceNumber);
    }

    @Override
    public String toString() {
        return "Employee{" +
               "name='" + getName() + "', " +
               "annualSalary=" + annualSalary + ", " +
               "hireDate=" + hireDate + ", " +
               "nationalInsuranceNumber='" + nationalInsuranceNumber + "'}";
    }

    @Override
    public Employee clone() {
        return new Employee(getName(), annualSalary, (Date) hireDate.clone(), nationalInsuranceNumber);
    }

    // compareTo method for sorting
    @Override
    public int compareTo(Employee other) {
        // Compare by salary first
        int salaryComparison = Double.compare(this.annualSalary, other.annualSalary);
        if (salaryComparison != 0) {
            return salaryComparison;
        }
        //  salaries are equal->compare by hire date
        return this.hireDate.compareTo(other.hireDate);
    }
}
