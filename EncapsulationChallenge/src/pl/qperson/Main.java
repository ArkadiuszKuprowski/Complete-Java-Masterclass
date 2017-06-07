package pl.qperson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer("Canon 2220X",false);

        System.out.println("Current printer counter is: " + printer.getPagesPrinted());
        System.out.println("Current printer toner is: " + printer.getTonerLevel());

        printer.print();
        printer.fillUpToner();
        printer.print(100);


        System.out.println("Current printer counter is: " + printer.getPagesPrinted());
        System.out.println("Current printer toner is: " + printer.getTonerLevel());

    }
}
