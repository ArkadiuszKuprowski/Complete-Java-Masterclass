package pl.qperson;

/**
 * Created by qpers on 2017-05-01.
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Jan Kowalski",10000.00,"Jan@vip.pl");
    }

    public VipCustomer(String name, String email) {
        this(name,10000.0,email);
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
