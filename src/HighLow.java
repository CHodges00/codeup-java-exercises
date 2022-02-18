import  java.util.Scanner;
import java.lang.Math;
public class HighLow {
    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);

        int count = 1;
        double randomNum = Math.random();
        int randomNum_int = (int) (randomNum * 100) + 1;
        System.out.printf("Random number is: %s%n", randomNum_int);

        do {
            System.out.println("Guess the number between 1-100");
            System.out.printf("Guess #%s of 10%n", count);
            int userGuess = guess.nextInt();

            if (userGuess < randomNum_int){
                System.out.println("Too low Joe");
            }else if (userGuess > randomNum_int){
                System.out.println("Too high guy");
            }else {
                System.out.println("GOOD GUESS");
            }

            count++;
            if (count == 11){
                System.out.println("Game Over 🤡");
                System.out.println("Try again ? Y/N");
            }


        }while (count <= 10);

    }
}
