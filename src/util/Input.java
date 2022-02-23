package util;

import java.util.Scanner;


public class Input {

    private final Scanner scan;

//    CREATES INSTANCE OF SCANNER
 public Input(){
     this.scan = new Scanner(System.in);
 }


// ENTER STRING AND RETURN ENTRY
 public String getString(){
     System.out.println("Enter string: ");
     return this.scan.nextLine();
 }


// RETURN T/F IF EQUALS YES/NO
 public boolean yesNo(){
     System.out.println("Y -- N ?");
     String input = this.scan.next();
     return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
 }


// ENTER INT BETWEEN MIN/MAX
 public int getInt(int min, int max){
     int input;
     do {
         System.out.printf("Enter # between %s - %s%n", min, max);
         input = this.scan.nextInt();
         if (input < min){
             System.out.println("Too low");
         }else if (input > max){
             System.out.println("Too High");
         }
     }while (input < min || input >max);
     return input;
 }


// RETURN INT ENTERED
 public int getInt(){
     System.out.println("Enter #: ");
     return this.scan.nextInt();
 }


// ENTER DOUBLE BETWEEN MIN/MAX
 public double getDouble(double min, double max){
     double input;
     do {
         System.out.printf("Enter a decimal between %s - %s%n", min, max);
         input = this.scan.nextDouble();
         if (input < min){
             System.out.println("Too low");
         }else if (input > max){
             System.out.println("Too High");
         }
     }while (input < min || input > max);
     return input;
 }


// RETURN DOUBLE ENTERED
 public double getDouble(){
     System.out.println("Enter a decimal: ");
     return this.scan.nextDouble();
 }

}


//NEED TO RESTART, MISTAKES WERE MADE...........