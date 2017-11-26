package com.sdaMRymarczyk;

public class Client {

    private String firstName;
    private String lastName;
    private String login;

    public Client(String firstName, String lastName, String login, ClientType type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.type = type;
    }

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public enum ClientType {
        REGULAR("Regular client in store"),
        VIP("Very important client");

        private String value;

        ClientType(String value) {
            this.value = value;
        }
    }
    private ClientType type;

}
