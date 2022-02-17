import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Let's Talk !");
        String entered = input.nextLine();



        String question = "Sure";
        String yell = "Whoa, chill out !";
        String nothing = "Fine. Be that way!";
        String other = "Whatever";

        if (entered.endsWith("?")) {
            System.out.printf("%s", question);
        } else if (entered.endsWith("!")) {
            System.out.printf("%s", yell);
        } else if (entered.equals("")) {
            System.out.printf("%s", nothing);
        } else {
            System.out.printf("%s", other);
        }

    }
}
