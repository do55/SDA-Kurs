package pl;

import pl.sda.sdajavaweekend.domain.Employee;
import pl.sda.sdajavaweekend.domain.Programmer;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Anna", "");
        Programmer programmer = new Programmer("John", "Java Developer");

        employee.getEmployeeDetails();
        programmer.getEmployeeDetails();

    }

    }
}