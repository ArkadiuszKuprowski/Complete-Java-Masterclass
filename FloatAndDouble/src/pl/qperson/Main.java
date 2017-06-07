package pl.qperson;

public class Main {

    public static void main(String[] args) {

        //4 bytes
        int myIntValue = 5 / 3;

        //4 bytes
        float myFloatValue = 5f / 3f;

        //64 bytes
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Excercise 1

        double pounds = 200;
        double convFactor = 0.45359237;

        System.out.println(pounds + " pounds converted to kilograms is: " + pounds * convFactor + " kg");



    }
}
