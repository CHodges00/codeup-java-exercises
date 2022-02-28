import java.util.Arrays;
import java.util.Random;


public class ServerNameGenerator {

//    TODO: Create a method that will return a random element from an array of strings.

    public static String randomWords(String[] array) {
        Random random = new Random();
        return array[random.nextInt(array.length-1)];
    }


//    TODO: Add a main method
    public static void main(String[] args) {

//    TODO: Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
        String[] adjectives = {"Fast", "Slow", "Tall", "Short", "Long", "Yellow", "Huge", "Tiny","Extravagant","Slippery"};

        String[] nouns = {"Hair","Helmet","Planet","Pillow","Pizza","Plastic","Animal","Apple","Helicopter","Answer"};

//        TODO: inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
        System.out.printf("Here is your server name:%n%s-%s",randomWords(adjectives), randomWords(nouns));


    }


}
