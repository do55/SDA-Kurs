package software.academy.hibernate.orders.entity;

import javax.persistence.*;


@Entity
@Table(name = "client")
public class Client {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //to znaczy, ze nasz id bedzie autoinkrementowany, może być też AUTO
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="second_name")
    private String secondName;

    @Column(name="email")
    private String email;

    @Column(name="type")
    @Enumerated(EnumType.STRING)
    private ClientType type;

    @OneToOne(fetch = FetchType.EAGER)
    //fetch = czy wyciągnij dla encji client od razu encję address - LAZY i EAGER(default)
    @PrimaryKeyJoinColumn
    private Address address;

    public Client(Integer id, String firstName, String secondName, String email, ClientType type) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.type = type;
    }

    public Client() {
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

    public Address getAddress() {
        return address;
    }
}
