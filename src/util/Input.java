package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("yes or no?");
        String userEntry = this.scanner.next();
        return userEntry.contains("y");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userEntry = this.scanner.next();
        return userEntry.contains("y");
    }

    public int getInt(int min, int max) {
        int userInput;
        do {
            System.out.printf("Enter a number between %s and %s!\n", min, max);
            userInput = Integer.parseInt(getString());
        } while (userInput < min || userInput > max);
        return userInput;
    }


    public int getInt() {
        try {
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Not an int");
        }
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int userInput = 0;
        userInput = Integer.parseInt(scanner.nextLine());
        return userInput;
    }

    public double getDouble(double min, double max) {
        double userInput;
        do {
            System.out.printf("Enter a double between %s and %s!\n", min, max);
            userInput = this.scanner.nextDouble();
        } while (userInput <= min || userInput >= max);
        return userInput;
    }

    public double getDouble(){
        try {
            return Double.parseDouble(getString());
        }catch (NumberFormatException e){
            throw new NumberFormatException("Not a double");
        }
    }
}