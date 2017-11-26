package pl.sdamodel;

import java.util.List;

public class Client {

    private String name;
    private String surname;
    private String pesel;
    private String street;
    private Integer streetNumber;
    private String city;
    private List<Account> accountList;

    public Client(String name, String surname, String pesel, String street, Integer streetNumber, String city, List<Account> accountList) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.accountList = accountList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        if (surname != null ? !surname.equals(client.surname) : client.surname != null) return false;
        if (pesel != null ? !pesel.equals(client.pesel) : client.pesel != null) return false;
        if (street != null ? !street.equals(client.street) : client.street != null) return false;
        if (streetNumber != null ? !streetNumber.equals(client.streetNumber) : client.streetNumber != null)
            return false;
        if (city != null ? !city.equals(client.city) : client.city != null) return false;
        return accountList != null ? accountList.equals(client.accountList) : client.accountList == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (pesel != null ? pesel.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (streetNumber != null ? streetNumber.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (accountList != null ? accountList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", city='" + city + '\'' +
                ", accountList=" + accountList +
                '}';
    }
}
