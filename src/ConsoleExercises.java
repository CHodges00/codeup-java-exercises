import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f \n", pi);
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter number: ");
//        int userNumber = scanner.nextInt();
//        System.out.println("Youe entered: " + userNumber);
//
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.printf("Enter three words: ");
//        String word1 = scanner2.next();
//        String word2 = scanner2.next();
//        String word3 = scanner2.next();
//        System.out.println("First word: " +word1+ ", Second word: " +word2+ ", Third word: " +word3);
//
//        Scanner scanner3 = new Scanner(System.in);
//        System.out.printf("Enter sentence: ");
//        String sentence = scanner3.nextLine();
//        System.out.println("Sentence: " + sentence);

        Scanner classroom = new Scanner(System.in);

        System.out.print("Enter width, length then height: ");
        int width = classroom.nextInt();
        int length = classroom.nextInt();
        int height = classroom.nextInt();
        System.out.printf("Width: %d, Length: %d, Height: %d%n", width, length, height);

        int area = width * height;
        System.out.printf("Area: %d%n", area);

        int perimeter = (width * 2) + (height * 2);
        System.out.printf("Perimeter: %d%n", perimeter);

        int volume = length * width * height;
        System.out.printf("Volume: %d%n", volume);



    }
}
