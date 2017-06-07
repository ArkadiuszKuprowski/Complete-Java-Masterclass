package pl.qperson;

public class Main {

    public static void main(String[] args) {

//        int value = 1;
//        if (value == 1) {
//            System.out.println("value was 1");
//        } else if (value == 2) {
//            System.out.println("value was 2");
//        } else {
//            System.out.println("value was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was 3, 4 or 5");
                System.out.println("actually it was: "+ switchValue);
                break;

            default:
                System.out.println("value was not 1,2,3,4 or 5");
                break;
        }

        char myChar = 'C';

        switch (myChar) {
            case 'A':
                System.out.println("that was A");
                break;
            case 'B':
                System.out.println("that was B");
                break;
            case 'C':
                System.out.println("that was C");
                break;
            case 'D':
                System.out.println("that was D");
                break;
            case 'E':
                System.out.println("that was E");
                break;
            default:
                System.out.println("character not found!");
                break;

        }

        String month = "JaNuaRy";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure!");
                break;

        }


















    }
}
