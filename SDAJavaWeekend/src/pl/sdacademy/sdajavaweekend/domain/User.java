package pl.sdacademy.sdajavaweekend.domain;

public class User {

    private String login;
    private String password;
    private Integer age;
    private String telephone;
    private String firstName;
    private String lastName;

    public static String message;

    public static void printMessage() {
        System.out.println(message);
    }

    public User() {}

    public User(String login, String password, Integer age, String telephone) {
        this.login = login;
        this.password = password;
        this.age = age;
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public String getTelephone() {
        return telephone;
    }

}