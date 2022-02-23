package util;

public class InputTest {

    public static void main(String[] args) {

        Input newInput1 = new Input();
        System.out.println(newInput1.getString());


        Input newInput2 = new Input();
        System.out.println(newInput2.yesNo());

        Input newInput3 = new Input();
        System.out.println(newInput3.getInt(1, 10));

        Input newInput4 = new Input();
        System.out.println(newInput4.getInt());

        Input newInput5 = new Input();
        System.out.println(newInput5.getDouble(1.1, 10.1));

        Input newInput6 = new Input();
        System.out.println(newInput6.getDouble());
    }

}
