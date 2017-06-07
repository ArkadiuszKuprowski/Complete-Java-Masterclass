package pl.qperson;

/**
 * Created by qpers on 2017-05-19.
 */
public class DeluxeHamburger extends Hamburger {


    public DeluxeHamburger(String name, String breadRollType, double basePrice) {
        super(name, breadRollType, basePrice);

        Addition chips = new Addition("chips",4.00);
        Addition drinks = new Addition("drinks",3.99);

        super.addAddition(chips,1);
        super.addAddition(drinks,1);

    }

    @Override
    public void addAddition(Addition addition, int amount) {
        System.out.println("You cannot add anything to Deluxe Burger!");
    }
}
