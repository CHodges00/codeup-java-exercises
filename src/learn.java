public class learn {

    public static int showMult (int x, int y){
        return x * y;
    }

    public static void main(String[] args) {

//        CREATE INT VARIABLE
        int y = 1;
        System.out.println("y = " + y);

//        BOOLEAN VALUES
        boolean yes = true;
        boolean no = false;
        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

//        GENERAGTE NEW STR VARIABLE
        String str = "New String";
        System.out.println("str = " + str);

//        RUN MULT METHOD
        System.out.println("showMult(5, 5) = " + showMult(5, 5));

//        PRINT STR 5 TIMES
        for (int i = 0; i < 5; i++){
            System.out.println("str = " + str);
        }




    }
}

