import java.util.Arrays;
import java.util.Random;
public class ServerNameGenerator {






    public static void main(String[] args) {

        String[] adjectives = {"Fast", "Slow", "Tall", "Short", "Long", "Yellow", "Huge", "Tiny","Extravagant","Slippery"};


        String[] nouns = {"Hair","Helmet","Planet","Pillow","Pizza","Plastic","Animal","Apple","Helicopter","Answer"};

        System.out.println((Arrays.toString(new String[]{nouns[(int) (Math.random() * 10)]})) + "-" + (Arrays.toString(new String[]{adjectives[(int) (Math.random() * 10)]})));
    }


}
