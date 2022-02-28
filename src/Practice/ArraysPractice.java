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








    
    public static void main(String[] args) {

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

    }


}
