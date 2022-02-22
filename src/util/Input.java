package util;

import java.nio.file.LinkPermission;
import java.util.Scanner;


public class Input {

    private Scanner scan = new Scanner(System.in);

    String getString() {
    scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = scan.nextLine();
        return input;
    }

    boolean yesNo() {
        scan = new Scanner(System.in);
        System.out.println("Enter Y,y,Yes or yes");
        String input = scan.nextLine();
        return input.equals("y") || input.equals("Y") || input.equals("Yes") || input.equals("yes");
    }

//    int getInt(int min, int max) {
//        scan = new Scanner(System.in);
//        do {
//            System.out.printf("Guess number between %s--%s", min, max);
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

    int getInt() {
        scan = new Scanner(System.in);
        System.out.println("Enter #");
        int input = scan.nextInt();
        return input;
    }

//    double getDouble(double min, double max) {
//        scan = new Scanner(System.in);
//        System.out.printf("Enter decimal between %s -- %s", min, max);
//        do {
//            System.out.printf("Guess number between %s--%s", min, max);
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
        scan = new Scanner(System.in);
        System.out.println("Enter Decimal");
        double input = scan.nextDouble();
        return input;
    }

}
    class InputTest {
        public static void main(String[] args) {

        }
    }


//NEED TO RESTART, MISTAKES WERE MADE...........