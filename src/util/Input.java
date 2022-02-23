package util;

import java.util.Scanner;


public class Input {

    private Scanner scan = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter String: ");
        return scan.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter Y,y,Yes or yes");
        String input = scan.nextLine();
        if (input.equals("y") || input.equals("Y") || input.equals("Yes") || input.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }


//    public int getInt(int min, int max) {
//        scan = new Scanner(System.in);
//        String cont = "Keep Going";
//        do {
//            System.out.printf("Enter number between %s--%s%n", min, max);
//            int userGuess = scan.nextInt();
//
//            if (userGuess < min) {
//                System.out.println("Too low Joe");
//                System.out.println(cont);
//            } else if (userGuess > max) {
//                System.out.println("Too high guy");
//                System.out.println(cont);
//            } else {
//                cont = "Done";
//                System.out.println(cont);
//                break;
//            }
//        } while (cont.equals("Keep Going"));
//    }


    public int getInt() {
        System.out.println("Enter #");
        return scan.nextInt();
    }

//    double getDouble(double min, double max) {
//        do {
//            System.out.printf("Enter number between %s--%s", min, max);
//            int userGuess = scan.nextInt();
//
//            if (userGuess < min){
//                System.out.println("Too low Joe");
//            }else if (userGuess > max){
//                System.out.println("Too high guy");
//            }else {
//                break;
//            }
//
//        }while ();
//
//    }

    double getDouble() {
        System.out.println("Enter Decimal");
        return scan.nextDouble();
    }


}


//NEED TO RESTART, MISTAKES WERE MADE...........