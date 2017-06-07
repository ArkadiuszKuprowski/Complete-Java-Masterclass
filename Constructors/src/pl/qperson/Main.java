package pl.qperson;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

//        bankAccount.setAccountNumber("PL465464654878744");
//        bankAccount.setBalance(0);
//        bankAccount.setCustomerName("Jola Niebogata");
//        bankAccount.setEmail("jola@gov.pl");
//        bankAccount.setPhoneNumber(600251055);
//
//        bankAccount.depositFunds(9.99);
//        System.out.println("Current account balance is: "+bankAccount.getBalance());
//
//        bankAccount.withdrawFunds(1.33);
//        System.out.println("Current account balance is: "+bankAccount.getBalance());

        BankAccount arkoweKonto = new BankAccount("PL5465467778",0,"qperson@gmail.com", "Arkadiusz", 126543696);
        BankAccount noweKonto = new BankAccount("Jan Kowalski","jan@kowalski.pl",600251025);

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(arkoweKonto.getAccountNumber());
        System.out.println(noweKonto.getAccountNumber());


        //ex1
        VipCustomer superklient = new VipCustomer("kowalski Jan",3,"jan@jan.pl");

        System.out.println(superklient.getName());
        System.out.println(superklient.getEmail());
        System.out.println(superklient.getCreditLimit());



    }
}
