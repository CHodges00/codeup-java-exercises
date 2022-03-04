package Practice;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {


        ArrayList<Integer> favNumbers = new ArrayList<>();
//ADD NUMS TO LIST
        favNumbers.add(7);

//        ADD NUM TO LIST
//          ADDS BEFORE
        favNumbers.add(0, 222);
//          ADDS AFTER
        favNumbers.add(222);


//        PRINT LIST
        System.out.println("==============================");
        System.out.println("favnumbers = " + favNumbers);
        System.out.println("==============================");

//        LIST ARRAY SIZE
        System.out.println("favNumbers = " + favNumbers);
        System.out.println("favnumbers.size() = " + favNumbers.size());
        System.out.println("==============================");

//        GET SOMETHING BY INDEX
        int myFavoriteNumber = favNumbers.get(0);
        System.out.println("favNumbers = " + favNumbers);
        System.out.println("myFavoriteNum = " + myFavoriteNumber);
        System.out.println("==============================");

//        SEARCH FOR SECOND FAV MUNBER
        System.out.println("favNumbers = " + favNumbers);
        System.out.println("favNumbers.indexOf(7) = " + favNumbers.indexOf(7));
        System.out.println("==============================");

//        GET TRIPPLE 7'S
//        CANT FIND THE INDEX'S SO RETURNS -1
        System.out.println("favNumbers = " + favNumbers);
        System.out.println("favNumbers.indexOf(777) = " + favNumbers.indexOf(777));
        System.out.println("==============================");

//IF THERE ARE 2 SAME NUMBERS IN ARRAY LIST
        favNumbers.add(7);
        System.out.println("favNumbers = " + favNumbers);
        System.out.println("favNumbers.size() = " + favNumbers.size());
        System.out.println("==============================");

//        WILL RETURN FIRST FOUND INDEX
        System.out.println("favNumbers = " + favNumbers);
        System.out.println("favNumbers.indexOf(7) = " + favNumbers.indexOf(7));
        System.out.println("==============================");

//        FIND LAST INDEX OF 7
        System.out.println("favNumbers = " + favNumbers);
        System.out.println("favNumbers.lastIndexOf(7) = " + favNumbers.lastIndexOf(7));
        System.out.println("==============================");

//        GET RID OF LAST 7
        System.out.println("favNumbers.remove(3) = " + favNumbers.remove(3));
        System.out.println("favNumbers = " + favNumbers);
        System.out.println("==============================");
    }
}
