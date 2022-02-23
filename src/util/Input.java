package util;

import java.util.Scanner;


public class Input {

    private final Scanner scan;

 public Input(){
     this.scan = new Scanner(System.in);
 }

 public String getString(){
     System.out.println("Enter string: ");
     return this.scan.nextLine();
 }

 public boolean yesNo(){
     System.out.println("Y -- N ?");
     String input = this.scan.next();
     return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
 }

 public int getInt(int min, int max){
     int input;
     do {
         System.out.printf("Enter # between %s - %s%n", min, max);
         input = this.scan.nextInt();
     }while (input < min || input >max);
     return input;
 }

 public int getInt(){
     System.out.println("Enter #: ");
     return this.scan.nextInt();
 }

 public double getDouble(double min, double max){
     double input;
     do {
         System.out.printf("Enter a decimal between %s - %s%n", min, max);
         input = this.scan.nextDouble();
     }while (input < min || input > max);
     return input;
 }

 public double getDouble(){
     System.out.println("Enter a decimal: ");
     return this.scan.nextDouble();
 }

}


//NEED TO RESTART, MISTAKES WERE MADE...........