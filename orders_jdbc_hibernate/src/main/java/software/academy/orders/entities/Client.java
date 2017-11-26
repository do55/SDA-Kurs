package software.academy.orders.entities;

public class Client {

    private Integer id;
    private String firstName;
    private String secondName;
    private String email;
    private ClientType type;

    public Client(Integer id, String firstName, String secondName, String email, ClientType type) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.type = type;
    }

    public Client(String firstName, String secondName, String email, ClientType type) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmail() {
        return email;
    }

    public ClientType getType() {
        return type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (id != null ? !id.equals(client.id) : client.id != null) return false;
        if (firstName != null ? !firstName.equals(client.firstName) : client.firstName != null) return false;
        if (secondName != null ? !secondName.equals(client.secondName) : client.secondName != null) return false;
        if (email != null ? !email.equals(client.email) : client.email != null) return false;
        return type == client.type;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
