package lab34;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe");
        System.out.println("Person: " + person);
        
        List<Employee> employees = new ArrayList<>();
        
        Employee employee1 = new Employee("Alice", 50000.0, new Date(120, 4, 15), "AB12345C");
        Employee employee2 = new Employee("Bob", 55000.0, new Date(121, 8, 20), "XY67890D");

        System.out.println("\nEmployee1 equals Employee2: " + employee1.equals(employee2));
        System.out.println("Employee1 hashCode: " + employee1.hashCode());
        System.out.println("Employee2 hashCode: " + employee2.hashCode());

        System.out.println("\nEmployee1: " + employee1);
        System.out.println("Employee2: " + employee2);

        Employee clonedEmployee = employee1.clone();
        System.out.println("\nCloned Employee: " + clonedEmployee);

        int comparisonResult = employee1.compareTo(employee2);
        if (comparisonResult < 0) {
            System.out.println("\nEmployee1 has a lower salary than Employee2");
        } else if (comparisonResult > 0) {
            System.out.println("\nEmployee1 has a higher salary than Employee2");
        } else {
            System.out.println("\nEmployee1 and Employee2 have the same salary");
        }

        Manager manager1 = new Manager("Carol", 70000.0, new Date(118, 6, 10), "MN12345E", 5000.0);
        Manager manager2 = new Manager("Dave", 75000.0, new Date(119, 2, 5), "QR67890F", 4500.0);

        System.out.println("\nManager1 equals Manager2: " + manager1.equals(manager2));
        System.out.println("Manager1 hashCode: " + manager1.hashCode());
        System.out.println("Manager2 hashCode: " + manager2.hashCode());

        System.out.println("\nManager1: " + manager1);
        System.out.println("Manager2: " + manager2);

        Manager clonedManager = manager1.clone();
        System.out.println("\nCloned Manager: " + clonedManager);

        int managerComparisonResult = manager1.compareTo(manager2);
        if (managerComparisonResult < 0) {
            System.out.println("\nManager1 has a lower salary or bonus than Manager2");
        } else if (managerComparisonResult > 0) {
            System.out.println("\nManager1 has a higher salary or bonus than Manager2");
        } else {
            System.out.println("\nManager1 and Manager2 have the same salary and bonus");
        }

        manager1.getTeam().add(employee1);
        manager1.getTeam().add(employee2);
        System.out.println("\nManager1's team: " + manager1.getTeam());
        
        System.out.println("Class of employee: " + employee1.getClass());
        
        employees.add(employee1);
        employees.add(employee2);

        
        Collections.sort(employees, new NameComparator());
        System.out.println("Employees sorted by name:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
        Collections.sort(employees, new HireDateComparator());
        System.out.println("\nEmployees sorted by hire date:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
    }
}
