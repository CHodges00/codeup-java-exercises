package Practice;

// TODO: IMPORT TO USE .toString METHOD

import java.util.Arrays;

public class ArraysPractice {

    //    TODO: CREATE METHOD THAT RETURNS SUM OF ALL INTEGERS INSIDE OF ARRAY
    public static int add() {
        int[] sum = {10, 20, 30, 50, 100};  // 210
        int x = 0;
        for (int n : sum) {
            x += n;
        }
        return x;
    }


    //        TODO: Write a program that creates an array, and then prints the sum of the even and odd integers in a new array [sumOdd, sumEven]
    public static int[] sums() {
        int[] warmUp = {3,1,7,2,8,3,5};
        int evens = 0;
        int odds = 0;
        int[] evenOdd = new int[2];

//        NORMAL FOR LOOP ,UST USE ARR[INDEX] TO SELECT ITEM IN ARRAY
//        for (int i = 0; i < warmUp.length; i++) {
//            if (warmUp[i] % 2 == 0) {
//                evens += warmUp[i];
//            } else {
//                odds += warmUp[i];
//            }
//        }

//        ENHANCED FOR LOOP CAN USE JUST I
        for (int i : warmUp){
            if (i % 2 == 0) {
                evens += i;
            } else {
                odds += i;
            }
        }
        evenOdd[0] = evens;
        evenOdd[1] = odds;
        return evenOdd;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(sums()));

//      LENGTH OF ARRAYS MUST BE DEFINED IN JAVA
//      DATA TYPES MUST ALSO BE DECLARED FOR ARRAY

//      HOW TO PROPERLY USE ARRAYS IN JAVA

        //   TODO:   CREATE ARRAY OF INTEGERS
        int[] texasTemps = new int[3];
        //    DATA TYPE OF VARIABLE - VAR NAME - INITIATE NEW ARRAY  - LENGTH OF ARRAY BEING CREATED [0][1][2]


        //    ASSIGN VALUES
        texasTemps[0] = 36;
        texasTemps[1] = 45;
        texasTemps[2] = 80;


        //        PRINT VALUE OF INDICES
        System.out.println(texasTemps[0]);
        System.out.println(texasTemps[1]);
        System.out.println(texasTemps[2]);

//        ============================================================================


        // TODO:        CREATE ARRAY OF STRINGS

        //        VAR WEATHERTYPE STORES ARRAY OF STRINGS = NEW ARRAY OF STRINGS TO VARIABLE WEATHERTYPE WITH LENGTH OF 3
        String[] weatherTypes = new String[3];
        //        WEATHERTYPES  = [[],[],[]]
        //        ASSIGN VALUES
        weatherTypes[0] = "Sunny";
        weatherTypes[1] = "Windy";
        weatherTypes[2] = "Cloudy";
//      ⬇️  OUT OF BOUNDS EXCEPTION BECAUSE ARRAY IS ONLY 3 INDICES LONG
//        weatherTypes[3] = "Snow";
        System.out.println(weatherTypes[2]);


//        HANDLE MULTIPLE ELEMENTS IN ARRAYS
//        TODO: CREATE ARRAY THAT HOLDS DAILY STEPS

        int[] dailySteps = {10000, 12500, 5000, 6250};
        System.out.println(Arrays.toString(dailySteps));


//        TODO: CREATE ARRAY OF INT AND PRINT
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numbers));


//         TODO: PRINT RETURN FOR ADD() METHOD // 210
        System.out.println(add());
        System.out.println("=============================================");




        //    TODO: TWO-DIMENSIONAL ARRAYS
//    {
//        [X][X][X][X],
//        [X][X][X][X],
//        [X][X][X][X]
//    }
        int[][] myMatrix = {
                {4,7,9},
                {1,5,9},
                {2,2,7}
        };
        System.out.println(Arrays.deepToString(myMatrix));

//            LOOP THROUGH OUTERMOST ARRAY TO GET INNER ARRAYS AS "ROW"
        for (int[] row : myMatrix){
            System.out.println("New row -----------");
            System.out.println(Arrays.toString(row));
//            LOOP THROUGH INNER ARRAYS TO GET VALUES OF INT'S INSIDE OF ARRAYS("ROW")
            for (int column: row){
                System.out.println(column);
            }
        }


//        =============
        int[][] newMatrix = new int[4][4];
        newMatrix[0][0] = 8;
        newMatrix[3][3] = 2;
        newMatrix[2][1] = 9;
        System.out.println(Arrays.deepToString(newMatrix));


//TODO:
        


    }
}