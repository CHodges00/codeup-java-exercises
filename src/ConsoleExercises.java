import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f \n", pi);


        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter number: ");
        int userNumber = scanner.nextInt();
        System.out.println("Youe entered: " + userNumber);


        Scanner scanner2 = new Scanner(System.in);
        System.out.printf("Enter three words: ");
        String word1 = scanner2.next();
        String word2 = scanner2.next();
        String word3 = scanner2.next();
        System.out.println("First word: " +word1+ ", Second word: " +word2+ ", Third word: " +word3);

        Scanner scanner3 = new Scanner(System.in);
        System.out.printf("Enter sentence: ");
        String sentence = scanner3.nextLine();
        System.out.println("Sentence: " + sentence);

        Scanner classroom = new Scanner(System.in);
        System.out.printf("Enter width then height: ");
        int width = classroom.nextInt();
        int height = classroom.nextInt();
        System.out.println("Width: " + width + " Height: " + height);

        int area = width * height;
        System.out.println("Area: " + area);

        int perimeter = (width * 2) + (height * 2);
        System.out.printf("Perimeter: " + perimeter);

    }
}
