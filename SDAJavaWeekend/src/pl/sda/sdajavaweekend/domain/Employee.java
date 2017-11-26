package pl.sda.sdajavaweekend.domain;

public class Employee {

    private String firstName;
    private String position;

    public Employee(String firstName, String position) {
        this.firstName = firstName;
        this.position = position;
    }

    public  void getEmployeeDetails() {
        System.out.println("First name: " + this.firstName + ", position: " + this.position);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPosition() {
        return position;
    }

    protected String getEmployeePrefix() {
        return "emp.";
    }
     String getEmpSuf() {
        return ".pl";
     }

}
