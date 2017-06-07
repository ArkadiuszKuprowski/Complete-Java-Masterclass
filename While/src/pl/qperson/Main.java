package pl.qperson;

public class Main {

    public static void main(String[] args) {

        int count = 0;

        while(count != 6) {

            System.out.println("Count value is " + count);
            count++;

        }

        System.out.println("************");

        count = 0;
        while (true) {

            if(count == 6) {
                break;
            }
            System.out.println("Count value is: " + count);
            count++;

        }

        System.out.println("************");

        count = 0;
        do {
            System.out.println("Count value is: " + count);
            count++;

            if(count >100) {
                System.out.println("Whoops!");
                break;
            }


        } while (count <= 5);


        count = 0;
        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber){

            if(!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            count++;
            number++;

            if(count == 5) break;

        }

        System.out.println("Total number of even numbers found:" +count);

    }

    public static boolean isEvenNumber(int number){

        if((number % 2) == 0) {

            return true;
        }
        return false;
    }



}
