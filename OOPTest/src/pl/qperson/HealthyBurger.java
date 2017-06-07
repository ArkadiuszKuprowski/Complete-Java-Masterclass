package pl.qperson;

/**
 * Created by qpers on 2017-05-19.
 */
public class HealthyBurger extends Hamburger {

    public HealthyBurger(String name, String breadRollType, double basePrice) {
        super(name, breadRollType, basePrice);
    }

    public void addHealthyAddition(HealthyAddition addition,int amount) {

        for(int i=0;i<amount;i++) {

            if(super.getAdditions().size() < 6) {

                super.addAdditionsElement(addition);
                System.out.println("Added: "+addition.getName()+" for a price: "+addition.getPrice());
                super.setEndPrice(super.getEndPrice()+addition.getPrice());

            } else {
                System.out.println("You cannot add more additions!");
                break;
            }
        }
    }

}
