package com.sdaMRymarczyk;

public class ClientBuilder {

    private String firstName;
    private String lastName;
    private String login;
    private Client.ClientType type;

    public ClientBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ClientBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    //gdy nie chcemy wypełniać wszytkich pól, które mamy w konstruktorze - wzorzec BUILDER
    public Client build() {
        return new Client(firstName, lastName, null, null);
    }
}
