package Groceries;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Items> groceries = new ArrayList<>();
        boolean end = false;
        do {
            Scanner groceryScanner = new Scanner(System.in);
            groceryScanner.useDelimiter(System.lineSeparator());
            System.out.print("Start ? -- Y/N");
            String startNewList = groceryScanner.nextLine();
            if (startNewList.equalsIgnoreCase("y")) {
                System.out.print("Add item ? -- Y/N ");
                String addNewItem = groceryScanner.nextLine();
                if (addNewItem.equalsIgnoreCase("y")) {
                    boolean done = false;
                    do {
                        System.out.print("What to add ? ");
                        String newItem = groceryScanner.next();
                        System.out.print("What genre ? ");
                        String newItemCategory = groceryScanner.next();
                        System.out.print("How many do you want ? ");
                        int newItemQuantity = groceryScanner.nextInt();
                        System.out.printf("Add to list ? %s(%s) x %s -- Y/N ", newItem, newItemCategory, newItemQuantity);
                        Scanner itemAdder = new Scanner(System.in);
                        String addItem = itemAdder.nextLine();
                        if (addItem.equalsIgnoreCase("y")) {
                            Items newItemToAdd = new Items(newItem, newItemCategory, newItemQuantity);
                            groceries.add(newItemToAdd);
                        }
                        System.out.print("Add item ? -- Y/N ");
                        String addAnother = itemAdder.nextLine();
                        if (addAnother.equalsIgnoreCase("n")) {
                            done = true;
                        }
                    } while (!done);
                } else System.exit(0);
            } else System.exit(0);
            boolean Sort = false;
            do {
                System.out.print("See list ? -- Y/N");
                String sort = groceryScanner.nextLine();
                if (sort.equalsIgnoreCase("y")) {
                    groceries.sort(Comparator.comparing(Items::getItem));
                    Sort = true;
                } else if (sort.equalsIgnoreCase("n")) {
                    groceries.sort(Comparator.comparing(Items::getCategory));
                    Sort = true;
                }
            } while (!Sort);
            for (Items grocery : groceries) {
                System.out.println(grocery.getItem() + " -- " + grocery.getCategory() + " -- " + grocery.getQuantity());
            }
            boolean Continue = false;
            do {
                System.out.print("How to continue ? -- 1 = add more / 2 = exit ");
                int startOver = groceryScanner.nextInt();
                if (startOver == 2) {
                    Continue = true;
                    end = true;
                } else if (startOver == 1) {
                    Continue = true;
                }
            } while (!Continue);

        } while (!end);
    }
}