import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static Scanner num = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println(add(10, 20));
//        System.out.println(sub(200, 100));
//        System.out.println(mult(20, 50));
//        System.out.println(div(100, 10));
//        System.out.println(mod(41, 4));

//        RANGE
//        System.out.println(range(45, 90));

//        FACTORIAL
//        System.out.println("Enter # 1-10");
//        long entered = num.nextLong();

//
//
//        if (entered > 0 && entered <= 10) {
//            long total = factorial(entered);
//            System.out.println("Factored total = " + total);
//            System.out.println("Continue? Enter: Y/N");
//        }else{
//            System.out.println("Number out of range, press enter again to end");
//        }
//
//
//        num.nextLine();
//        String confirm = num.nextLine();
//        if (confirm.equals("Y")){
//            System.out.println("I'm Stuck");
//        }

        System.out.println("Enter # of sides for each of the 2 die");
        int sides1 = num.nextInt();
        int sides2 = num.nextInt();
        System.out.println("Your first die has " + sides1 + " sides and your second die has " + sides2 + " sides");

        System.out.println("Would you like to roll the dice? Y/N");
        num.nextLine();
        String confirm = num.nextLine();


        if (confirm.equals("Y")){
            dice(sides1, sides2);
        }


    }


//    public static long factorial(long factor) {
//        long numMultiplied = 1;
//        for (int numBefore = 2; numBefore <= factor; numBefore++) {
//            numMultiplied *= numBefore;
//        }
//        return numMultiplied;
//    }
//
//
//    public static int add(int a, int b) {
//        return a + b;
//    }

//    public static int sub(int a, int b) {
//        return a - b;
//    }



//    public static int mult(int a, int b) {
//        return a * b;
//    }



//    public static int div(int a, int b) {
//        return a / b;
//    }



//    public static int mod(int a, int b) {
//        return a % b;
//    }


//
//    public static int range(int min, int max) {
//        Scanner userNumber = new Scanner(System.in);
//        System.out.printf("Enter # %s-%s%n", min, max);
//        int input = userNumber.nextInt();
//        if (input >= min && input <= max) {
//            System.out.println("Keep Going !");
//        } else
//            System.out.println("Try Again Later!");
//        return range(min, max);
//
//    }

    public static int dice(int sides1, int sides2){

    double roll1 = 1 + Math.random() * sides1;
    int roll1_i = (int) roll1;
    double roll2 = 1 + Math.random() * sides2;
    int roll2_i = (int) roll2;
        System.out.printf("First die rolled: %s%nSecond die rolled: %s", roll1_i, roll2_i);
    return sides1 + sides2;
    }

}

