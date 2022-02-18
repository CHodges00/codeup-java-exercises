import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {


        //        WHILE LOOP

//        int i = 5;
//        while (i <= 15){
//            System.out.printf("%s ", i);
//            i++;
//        }


        //            DO WHILE LOOP

//        int i = 0;
//        do {
//            System.out.printf("%s%n", i);
//            i = i + 2;
//        }while (i <= 100);


//        int i = 100;
//        do {
//            System.out.printf("%s%n", i);
//            i = i - 5;
//        } while (i >= -10);


//        int i = 2;
//        long i_lng = i;
//        do {
//            System.out.printf("%s%n", i_lng);
//            i_lng = i_lng * i_lng;
//        }while (i_lng < 1000000);


        //        REFACTOR TO FOR LOOP

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.printf("%s%n", i);
//        }


//        for (int i = 100; i >= -10; i -= 5){
//            System.out.printf("%s%n", i);
//        }


//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.printf("%s%n", i);
//        }



        //        FIZZBUZZ
// 1 - 100
//%3 = FIZZ
//%5 = BUZZ
//IF BOTH THEN = FIZZBUZZ
//
//
//        for(int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 & i % 5 == 0) {
//            System.out.println("FIZZBUZZ");
//            } else if (i % 5 == 0){
//            System.out.println("BUZZ");
//            }else if (i % 3 == 0){
//                System.out.println("FIZZ");
//            }else{
//                System.out.printf("%s%n", i);
//            }
//        }



//        TABLE OF POWERS


//        Scanner table = new Scanner(System.in);
//        System.out.println("Enter number, preferably under 10: ");
//        int entered = table.nextInt();
//        System.out.println("number\t|\tsquared\t|\tcubed");
//        System.out.println("------\t|\t------\t|\t------");
//        for (int i = 1; i <= entered; i++){
//            int squared = i * i;
//            int cubed = i * i * i;
//            System.out.printf("%s\t\t|\t%s\t\t|\t%s%n", i, squared, cubed);
//        }


Scanner grades = new Scanner(System.in);
String cont = "";

do {System.out.println("Enter your grade:  1-100 ");
    int grade = grades.nextInt();

    if (grade > 0 && grade < 60) {
        System.out.println("You made an F....Do Better");
    } else if (grade > 59 && grade < 67) {
        System.out.println("You made a D...Meh");
    } else if (grade > 66 && grade < 80) {
        System.out.println("You made a C....Slipping By");
    } else if (grade > 79 && grade < 88) {
        System.out.println("You made a B....Good Job");
    } else if (grade > 87 && grade < 100) {
        System.out.println("You made an A.....AWESOME !");
    } else if (grade == 100) {
        System.out.println("PERFECT SCORE !!! 🤘");
    } else {
        System.out.println("Try Again");
    }
    System.out.println("Continue ? Y/N");
    cont = grades.next();
}while (cont.equals("y"));



    }
}
