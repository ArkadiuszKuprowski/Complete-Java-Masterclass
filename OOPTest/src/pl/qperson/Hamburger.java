package pl.qperson;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {

    private String name;
    private String breadRollType;
    private double basePrice;
    private double endPrice;

    private List<Addition> additions = new ArrayList<>();


    public Hamburger(String name, String breadRollType, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.basePrice = basePrice;
        this.endPrice = basePrice;

        System.out.println("Base hamburger created - name:"+this.name+" ,bread:"+this.breadRollType+" ,base price:"+this.basePrice);

    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getEndPrice() {
        return endPrice;
    }

    public List<Addition> getAdditions() {
        return additions;
    }

    public void addAdditionsElement(Addition addition) {
        this.additions.add(addition);
    }

    public void setEndPrice(double endPrice) {
        this.endPrice = endPrice;
    }

    public void addAddition(Addition addition, int amount) {

            for(int i=0;i<amount;i++) {

                if(this.additions.size() < 5) {

                    this.additions.add(addition);
                    System.out.println("Added: "+addition.getName()+" for a price: "+addition.getPrice());
                    this.endPrice += addition.getPrice();

                } else {
                    System.out.println("You cannot add more additions!");
                    break;
                }
            }
    }
}

