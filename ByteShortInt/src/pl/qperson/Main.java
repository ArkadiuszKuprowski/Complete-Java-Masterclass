package pl.qperson;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue =  2_147_483_647;

        int myTotal = (myMaxValue/2);
        System.out.println("MyTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128;

        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("MyNewByteTotal = " + myNewByteValue);


        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);

        System.out.println("myNewShortValue = " + myNewShortValue);

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

        //Excercise 1

        byte myByte = 33;
        short myShort = 333;
        int myInt = 1324325;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);

        short myShortTotal = (short) (100 + 10 * (myByte + myShort + myInt));

        System.out.println("Long Total = " + myLong);
        System.out.println("Short Total = " + myShortTotal);

    }
}

