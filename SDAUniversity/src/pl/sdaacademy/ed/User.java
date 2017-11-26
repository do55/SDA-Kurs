package pl.sdaacademy.ed;

public abstract class User  {

    private String name;
    private String role;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public abstract void showUserDetails();
//nie możemy tworzyć metod abstrakcyjnych w klasach, które nie są abstrakcyjne
}
