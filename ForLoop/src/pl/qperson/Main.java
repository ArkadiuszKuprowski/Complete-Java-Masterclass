package pl.qperson;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        for(int i = 2; i <= 8; i++){

            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f",calculateInterest(10000.0,(double) i)));
        }

        System.out.println("**********************");
        //ex1
        for(int i = 8; i >= 2; i--){

            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f",calculateInterest(10000.0,(double) i)));
        }


        System.out.println("**********************");
        //ex2

        int counter = 0;

        for(int i = 100; i <= 100000; i++){

            if(isPrime(i)) {
                System.out.println(i + " is prime number!");
                counter++;
                if(counter == 100) {
                    System.out.println("Exiting the loop, " + counter + " prime numbers found");
                    break;
                }
            }


        }

    }

    public static boolean isPrime(int n) {

        if(n == 1){
            return false;
        }

        //for(int i=2; i<= n/2; i++) {
        //Optimized!
        for(int i=2; i<= (long) Math.sqrt(n) ; i++) {
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {

        return(amount * (interestRate/100));
    }
}