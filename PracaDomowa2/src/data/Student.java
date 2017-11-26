package data;

public class Student {

    public Student(String firstName, String lastName, String className, String tutor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.className = className;
        this.tutor = tutor;
    }

    private String firstName;
    private String lastName;
    private String className;
    private String tutor;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Student{" + firstName + " " + lastName + " class: " + className + " tutor: " + tutor + "}";

    }
}
