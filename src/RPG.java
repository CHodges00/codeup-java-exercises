import java.util.Scanner;
import java.util.Random;

public class RPG {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to begin ? y/n");
        String start = scan.nextLine();


//        COMMANDS
        String attack = "Attack";
        String potion = "Potion";
        String run = "Run";
        String continueOn = "What will you do ? Options : Attack, Potion, Run";

//       RANDOM # OF POTIONS, POTION HEAL, ATTACK DAMAGE
        double random = Math.random();
        double random2 = Math.random();
        int potions = (int) (random * 5);

        int playerHealth = (int) (random * 150) + 50;
        int enemyHealth = (int) (random2 * 150) + 50;

        if (start.equals("y")) {
            System.out.printf("Your health = %s%n", playerHealth);
            System.out.printf("Enemy health = %s%n", enemyHealth);
            System.out.printf("You are gifted %s potion(s)%n", potions);
            System.out.println("PREPARE FOR BATTLE !");
        }

        do {
            System.out.println(continueOn);
            String option = scan.nextLine();
            if (option.equals(attack)) {
                int attackPoints = Attack();
                System.out.printf("Deal %s damage to enemy player%n", attackPoints);
                enemyHealth -= attackPoints;
                System.out.printf("Enemy health = %s%n", enemyHealth);
            } else if (option.equals(potion)) {

                if (potions == 0) {
                    System.out.println("No more potions !");
                } else {
                    int potionHeal = POTION();
                    System.out.printf("Give player %s health%n", potionHeal);
                    playerHealth += potionHeal;
                    potions -= 1;
                    System.out.printf("Potions remaining = %s%n", potions);
                    System.out.printf("Your health = %s%n", playerHealth);
                }
            } else if (option.equals(run)) {
                System.out.println("COWARD 🏃🏻♂💨💨");
                break;
            } else if (playerHealth > 0){
                int enemyAttack = Attack();
                System.out.printf("Enemy has attacked for %s damage%n", enemyAttack);
                playerHealth -= enemyAttack;
                System.out.printf("Your health = %s%n", playerHealth);
                System.out.printf("Enemy health = %s%n", enemyHealth);

            }
            else {
                System.out.println("Can't do that here !");
            }

        } while (playerHealth > 0 && enemyHealth > 0);


    }

    public static int POTION () {
        double random = Math.random();
        int num = (int) (random * 10) + 1;
        return num;
    }

    public static int Attack () {
        double random = Math.random();
        int num = (int) (random * 50) + 1;
        return num;
    }


}
