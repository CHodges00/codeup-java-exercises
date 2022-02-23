package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input1 = new Input();

        System.out.println("Enter the radius of the circle as format listed below:  ");

        double radius = input1.getDouble();
        Circle circle1 = new Circle(radius);

        System.out.printf("The area of the circle is: %.2f%n", circle1.getArea());
        System.out.printf("The circumference of the circle is: %.2f%n", circle1.getCircumference());

    }
}
