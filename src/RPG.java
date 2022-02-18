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
        String continueOn = "What will you do ? Options : A = Attack, P = Potion, R = Run";

//       RANDOM # OF POTIONS, POTION HEAL, ATTACK DAMAGE
        double random = Math.random();
        double random2 = Math.random();
        int potions = (int) (random * 5);

        int playerHealth = (int) (random * 150) + 50;
        int enemyHealth = (int) (random2 * 150) + 50;

        if (start.equals("y")) {
            System.out.printf(" 🩸 Your health = %s%n", playerHealth);
            System.out.printf(" 🖤 Enemy health = %s%n", enemyHealth);
            System.out.printf(" 🍄 You are gifted %s potion(s)%n", potions);
            System.out.println("PREPARE FOR BATTLE !");
            System.out.println("----------- Wrong inputs will cost a turn -----------");
            System.out.println("----------- Using a Potion gives up Attack ability for turn -----------");
        }

        do {
            System.out.println(continueOn);
            String option = scan.nextLine();
            if (option.equalsIgnoreCase(attack)) {
                int attackPoints = Attack();
                System.out.printf(" ⚡️ You deal %s damage to enemy player%n", attackPoints);
                enemyHealth -= attackPoints;
//                System.out.printf(" 🖤 Enemy health = %s%n", enemyHealth);
            } else if (option.equalsIgnoreCase(potion)) {

                if (potions == 0) {
                    System.out.println("No more potions !");
                } else {
                    int potionHeal = POTION();
                    System.out.printf(" 🍄 Give player %s health%n", potionHeal);
                    playerHealth += potionHeal;
                    potions -= 1;
                    System.out.printf("Potions remaining = %s%n", potions);
                    System.out.printf(" 🩸 Your health = %s%n", playerHealth);
                }
            } else if (option.equalsIgnoreCase(run)) {
                System.out.println("COWARD 🏃🏻💨💨");
                break;
            } else {
                System.out.println("Can't do that here !");
            }
            {
                int enemyAttack = Attack();
                System.out.printf(" ⚡️ Enemy has attacked for %s damage%n", enemyAttack);
                playerHealth -= enemyAttack;
                System.out.printf(" 🩸 Your health = %s%n", playerHealth);
                System.out.printf(" 🖤 Enemy health = %s%n", enemyHealth);
            }


        } while (playerHealth > 0 && enemyHealth > 0);


        if (enemyHealth < 0 || playerHealth < 0) {
            System.out.println("----------- GAME OVER -----------");
            if (enemyHealth > playerHealth) {
                System.out.println("❌ DEFEAT ❌");
            } else {
                System.out.println("🎉 WINNER 🎉");
            }
        }



    }

    public static int POTION() {
        double random = Math.random();
        int num = (int) (random * 50) + 5;
        return num;
    }

    public static int Attack() {
        double random = Math.random();
        int num = (int) (random * 50) + 1;
        return num;
    }


}
