package Groceries;

import java.util.ArrayList;

public class List {
    ArrayList<Items> groceries;

    public void GroceryList(ArrayList<Items> groceries) {
        this.groceries = groceries;
    }

    public ArrayList<Items> getGrocery() {
        return groceries;
    }

    public void setGrocery(ArrayList<Items> groceries) {
        this.groceries = groceries;
    }
}


