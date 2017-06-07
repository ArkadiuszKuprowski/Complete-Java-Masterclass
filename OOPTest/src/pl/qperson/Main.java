package pl.qperson;

public class Main {

    public static void main(String[] args) {

        Addition meat = new Addition("Sousage", 1.33);
        Addition cheese = new Addition("Ementaler", 1.01);
        Addition tomato = new Addition("Tomato Slices",0.25);
        Addition letuce = new Addition("Letuce",0.03);
        Addition carrot = new Addition("Carrot",0.2);
        Addition ketchup = new Addition("ketchup",0.2);

        HealthyAddition soya = new HealthyAddition("soya",0.99);
        HealthyAddition helthyStuff = new HealthyAddition("healthyStuff",1.11);

        Hamburger hamburger = new Hamburger("Basic","White",2.00);

        hamburger.addAddition(meat,1);
        hamburger.addAddition(cheese,3);
        hamburger.addAddition(tomato,1);
        hamburger.addAddition(ketchup,1);

        System.out.println("Hamburger End Price is: "+hamburger.getEndPrice());
        System.out.println("-------------------------------------------------");
        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("BioVegeBurger","Brown",5);
        healthyBurger.addAddition(cheese,2);
        healthyBurger.addHealthyAddition(soya,7);
        System.out.println("HealtyhyBurger End Price is: "+healthyBurger.getEndPrice());
        System.out.println("-------------------------------------------------");
        System.out.println();

        DeluxeHamburger superBurger = new DeluxeHamburger("Super Burger!","Extra BIG",8);
        superBurger.addAddition(meat,3);
        System.out.println("superBurger End Price is: "+superBurger.getEndPrice());
        System.out.println("-------------------------------------------------");
        System.out.println();

    }
}
