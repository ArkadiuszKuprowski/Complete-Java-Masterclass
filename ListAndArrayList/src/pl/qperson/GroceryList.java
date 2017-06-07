package pl.qperson;

import java.util.ArrayList;

/**
 * Created by qpers on 2017-05-21.
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        this.groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + this.groceryList.size() + " in your list");

        for(int i=0; i<this.groceryList.size();i++){
            System.out.println((i+1)+". "+ this.groceryList.get(i));
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        this.groceryList.set(position,newItem);
        System.out.println("Grocery item "+ (position+1) + "has been modified");

    }

    private void removeGroceryItem(int position) {
        //String theItem = this.groceryList.get(position);
        this.groceryList.remove(position);

    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }

    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }

        return false;
    }


    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position,newItem);
        }

    }

}

