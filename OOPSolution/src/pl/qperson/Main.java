package pl.qperson;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("Basic","Sausage",3.56,"White");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Letucce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.12);

        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

    }
}
