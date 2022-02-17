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

        System.out.println("Enter # 1-10");
        long entered = num.nextLong();

        if (entered >= 0 && entered <= 10) {
            System.out.println("Y/N");
        }

        num.nextLine();
        String confirm = num.nextLine();
        if (confirm.equals("Y")){
            System.out.println("Factored total = " + factorial(entered));
        }




    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }



    public static int mult(int a, int b) {
        return a * b;
    }



    public static int div(int a, int b) {
        return a / b;
    }



    public static int mod(int a, int b) {
        return a % b;
    }



    public static int range(int min, int max) {
        Scanner userNumber = new Scanner(System.in);
        System.out.printf("Enter # %s-%s%n", min, max);
        int input = userNumber.nextInt();
        if (input >= min && input <= max) {
            System.out.println("Keep Going !");
        } else
            System.out.println("Try Again !");
        return range(min, max);
    }



    public static long factorial(long factor) {
        long numMultiplied = 1;

        for (int numBefore = 2; numBefore <= factor; numBefore++) {
            numMultiplied *= numBefore;
//            System.out.printf(" numbersBefore: %s, afterMultiplied: %s%n", numBefore, numMultiplied );
        }
        return numMultiplied;
    }




}
