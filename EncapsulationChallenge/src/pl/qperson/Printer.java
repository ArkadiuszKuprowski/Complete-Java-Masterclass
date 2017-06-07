package pl.qperson;

/**
 * Created by qpers on 2017-05-16.
 */
public class Printer {
    private String name;
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(String name,boolean duplex) {
        this.name = name;
        this.duplex = duplex;
    }

    public void fillUpToner(){
        this.tonerLevel = 100;
    }

    public void print() {
        print(1);
    }

    public void print(int numberOfPages){

        if(tonerLevel >= 0 && tonerLevel >= numberOfPages) {

            this.pagesPrinted = pagesPrinted + numberOfPages;
            this.tonerLevel = tonerLevel - numberOfPages;

        } else {
            System.out.println("PLEASE BUY NEW TONER!");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
