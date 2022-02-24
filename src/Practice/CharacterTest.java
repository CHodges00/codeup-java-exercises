package Practice;

public class CharacterTest {


    public static void main(String[] args) {

        Heroes Hone = new Heroes("TIM", "MALE", "800");
        Heroes Htwo = new Heroes("SHEILA", "FEMALE", "500");
        Villians Vone = new Villians("DOUG", "FEMALE", "SAND BLOCKER", "550");
        Villians Vtwo = new Villians("POLLY", "MALE", "WATER BLOCKER", "779");

//NAMES
        System.out.println("Hone.getName() = " + Hone.getName());
        System.out.println("Htwo.getName() = " + Htwo.getName());
        System.out.println("Vone.getName() = " + Vone.getName());
        System.out.println("Vtwo.getName() = " + Vtwo.getName());
        System.out.println("-------------------------------------------");

        System.out.println("Hone.getPower() = " + Hone.getPower());
        System.out.println("Htwo.getPower() = " + Htwo.getPower());
        System.out.println("Vone.getPower() = " + Vone.getPower());
        System.out.println("Vtwo.getPower() = " + Vtwo.getPower());
        System.out.println("-------------------------------------------");

        Hone.setShout("WATER BENDER");
        Htwo.setShout("EARTH BENDER");
        System.out.println("Hone.getShout() = " + Hone.getShout());
        System.out.println("Htwo.getShout() = " + Htwo.getShout());
        System.out.println("Vone.getShout() = " + Vone.getScream());
        System.out.println("Vtwo.getShout() = " + Vtwo.getScream());
        System.out.println("-------------------------------------------");

        System.out.println("Hone.getSex() = " + Hone.getSex());
        System.out.println("Htwo.getSex() = " + Htwo.getSex());
        System.out.println("Vone.getSex() = " + Vone.getSex());
        System.out.println("Vtwo.getSex() = " + Vtwo.getSex());
        System.out.println("-------------------------------------------");

        System.out.println("Hone.present() = " + Hone.present());
        System.out.println("Htwo.present() = " + Htwo.present());
        System.out.println("Vone.present() = " + Vone.present());
        System.out.println("Vtwo.present() = " + Vtwo.present());
        System.out.println("-------------------------------------------");
    }


}
