public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Hello, ");
        System.out.println("World!");
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

        int myFavoriteNumber = 25;
        System.out.println(myFavoriteNumber);

        String myString = "Turtles";
        System.out.println(myString);
//        Character myString = 'Turtles';
//        int myString = "Turtles";

        double myNumber = 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";

        int x = 4;
        x += 5;
        System.out.println(x);

        x = 3;
        int y;
        y = 4;
        y = y*=x;
        System.out.println(y);


        x = 10;
        y = 2;
        x = x/=y;
        System.out.println(x);

        x = 10;
        y = 2;
        y = y-=x;
        System.out.println(y);



        byte numbers = 125;
        System.out.println(numbers++);
        System.out.println(numbers++);
        System.out.println(numbers++);
        System.out.println(numbers++);
        System.out.println(numbers++);


    }

}
