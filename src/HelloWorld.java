public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Hello, ");
        System.out.println("World!");
        {
            System.out.print('H');
            System.out.print('e');
            System.out.print('l');
            System.out.print('l');
            System.out.print('o');
            System.out.print(',');
            System.out.print(' ');
            System.out.print('W');
            System.out.print('o');
            System.out.print('r');
            System.out.print('l');
            System.out.print('d');
            System.out.println('!');
        }
        System.out.println("---------------------------------");

        int myFavoriteNumber = 25;
        System.out.println(myFavoriteNumber);
        System.out.println("---------------------------------");

        String myString = "Turtles";
        System.out.println(myString);
//        Character myString = 'Turtles';
//        int myString = "Turtles";
        System.out.println("---------------------------------");

        double myNumber = 3.14;
        System.out.println(myNumber);
        System.out.println("---------------------------------");

        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        System.out.println("---------------------------------");

        x = 5;
        System.out.println(++x);
        System.out.println(x);
        System.out.println("---------------------------------");

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";

        x = 4;
        x += 5;
        System.out.println(x);
        System.out.println("---------------------------------");

        x = 3;
        int y;
        y = 4;
        y = y*=x;
        System.out.println(y);
        System.out.println("---------------------------------");


        x = 10;
        y = 2;
        x = x/=y;
        System.out.println(x);
        System.out.println("---------------------------------");

        x = 10;
        y = 2;
        y = y-=x;
        System.out.println(y);
        System.out.println("---------------------------------");



        byte numbers = 125;
        System.out.println(numbers++);
        System.out.println(numbers++);
        System.out.println(numbers++);
        System.out.println(numbers++);
        System.out.println(numbers++);
        System.out.println("---------------------------------");


    }

}
