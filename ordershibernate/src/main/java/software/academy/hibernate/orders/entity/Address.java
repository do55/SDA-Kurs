package software.academy.hibernate.orders.entity;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="postal_code")
    private String postal_code;

    public Address(){}

    public Address(String street, String city, String postal_code) {
        this.street = street;
        this.city = city;
        this.postal_code = postal_code;
    }

    public Integer getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostal_code() {
        return postal_code;
    }
}
