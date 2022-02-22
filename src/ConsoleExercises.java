import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f \n", pi);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int userNumber = scanner.nextInt();
        System.out.println("You've entered: " + userNumber);
//
////
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter three words: ");
        String word1 = scanner2.nextLine();
        System.out.println(word1);
        String word2 = scanner2.nextLine();
        System.out.println("word2 = " + word2);
        String word3 = scanner2.nextLine();
        System.out.println("word3 = " + word3);
//        System.out.println("First word: " +word1+ ", Second word: " +word2+ ", Third word: " +word3);
        System.out.printf("First word: %s  Second word: %s Third word: %s%n", word1, word2, word3 );
//
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = scanner3.nextLine();
        System.out.println("Sentence: " + sentence);

        Scanner classroom = new Scanner(System.in);
//        classroom.useDelimiter("\n");
        System.out.print("Enter width, length then height: ");
        double width_d = classroom.nextDouble();
        int width_int = (int) width_d;
        double length_d = classroom.nextDouble();
        int length_int = (int) length_d;
        double height_d = classroom.nextDouble();
        int height_int = (int) height_d;
        System.out.printf("Width: %s, Length: %s, Height: %s%n", width_int, length_int, height_int);

        int area = width_int * height_int;
        System.out.printf("Area: %s%n", area);

        int perimeter = (width_int * 2) + (height_int * 2);
        System.out.printf("Perimeter: %s%n", perimeter);

        int volume = length_int * width_int * height_int;
        System.out.printf("Volume: %s%n", volume);

    }

}




//PSVM ENTER
//VAR.SOUTV


