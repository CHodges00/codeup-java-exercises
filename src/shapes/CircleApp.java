package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input1 = new Input();
        int count = 1;

        System.out.println("Enter the radius of the circle:  ");

        double radius = input1.getDouble();
        Circle circle1 = new Circle(radius);


        System.out.printf("The area of the circle is: %.2f%n", circle1.getArea());
        System.out.printf("The circumference of the circle is: %.2f%n", circle1.getCircumference());
        System.out.println("=============================================");
        System.out.printf("You have created %s circle(s)%n", count);
        System.out.println("=============================================");
        System.out.println("Continue ?");
        boolean input = input1.yesNo();
        do{
            System.out.println("=============================================");
            System.out.println("Enter the radius of the circle:  ");

            radius = input1.getDouble();
            circle1 = new Circle(radius);
            System.out.printf("The area of the circle is: %.2f%n", circle1.getArea());
            System.out.printf("The circumference of the circle is: %.2f%n", circle1.getCircumference());
            System.out.println("=============================================");
            count++;
            System.out.printf("You have created %s circle(s)%n", count);
            System.out.println("=============================================");

            System.out.println("Continue ?");
            input = input1.yesNo();
        }while (input);



    }
}
