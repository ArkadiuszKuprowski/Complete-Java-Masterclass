package pl.qperson;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
//    private static int[] baseData = new int[10];

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
                case 7:
                    processArrayList();
                    break;
            }

        }

//        System.out.println("Enter 10 integers: ");
//        getInput();
//        printArray(baseData);
//        resizeArray();
//        baseData[10] = 67;
//        baseData[11] = 23;
//        printArray(baseData);
    }

    public static void printInstructions() {

        System.out.println("\nPress 1 - 6: ");
    }

    public static void addItem() {
        System.out.print("Add item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item name: ");
        String oldItem = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(oldItem,newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name to remove : ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found "+searchItem+ " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

    }


//    public static void getInput() {
//
//        for(int i=0; i<baseData.length; i++) {
//            baseData[i] = scanner.nextInt();
//        }
//
//    }
//
//    public static void printArray(int[] array) {
//
//        for(int i=0;i<array.length;i++) {
//
//            System.out.println("Element "+i+" = "+array[i]);
//        }
//
//    }
//
//    private static void resizeArray(){
//
//        int[] original = baseData;
//
//        baseData = new int[12];
//        for(int i=0; i<original.length; i++){
//            baseData[i] = original[i];
//        }
//    }
}
