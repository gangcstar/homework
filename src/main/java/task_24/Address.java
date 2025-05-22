package task_24;

public class Address {
    private String city;
    private String street;
    private Integer home;


    public Address(String city, String street, Integer home) {
        this.city = city;
        this.street = street;
        this.home = home;
    }

    @Override
    public String toString() {
        return "City - " + city + ", Street - " + street + ", Home - " + home;
    }
}
