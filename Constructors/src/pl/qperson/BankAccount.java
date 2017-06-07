package pl.qperson;

/**
 * Created by qpers on 2017-05-01.
 */
public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {

        this("DE6546464",0.00,"new@customer","New Customer",1265488650);
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String email, String customerName, int phoneNumber) {

        System.out.println("Constructor with paramaters called");

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.email = email;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this("9999999",123.55,email,customerName,phoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void depositFunds(double funds) {

        this.balance += funds;
    }

    public void withdrawFunds(double funds) {

        if(funds <= this.balance) this.balance -= funds;
    }


}
