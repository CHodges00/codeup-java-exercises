import java.security.Permission;
import java.text.NumberFormat;
import java.util.Locale;
import java.io.*;
import java.util.*;
import java.util.Scanner;
//public class solution {
//
//
//
//    public static void main(String[] args) {
//        int[] prices = new int[6];
//        int max = 0;
//        int min = Integer.MAX_VALUE;
//        prices[0] = 3;
//        prices[1] = 6;
//        prices[2] = 5;
//        prices[3] = 4;
//        prices[4] = 9;
//        prices[5] = 2;
//
//        for (int price : prices) {
//            if (price < min) {
//                min = price;
//            } else {
//                max = Math.max(max, price - min);
//            }
//        }
//        System.out.println(max);
//    }
//}

//import java.util.Scanner;
//
//public class Solution {
//
//    static int getValue(int a,int b, int n) {
//
//        int sum = a;
//        for(int z=n;z>=0;z--) {
//            sum = sum + ((int) Math.pow(2,z))*b;
//        }
//
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = 0;
//        int a = 0;
//        int b = 0;
//        int n = 0;
//        t = in.nextInt();
//        for(int i=0;i<t;i++) {
//            a = in.nextInt();
//            b = in.nextInt();
//            n = in.nextInt();
//            for(int j =0;j<n;j++) {
//                System.out.print(getValue(a,b,j)+" ");
//            }
//            System.out.println();
//        }
//    }
//}


//class Solution{
//    public static void main(String []argh)
//    {
//
//
//
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//
//        for(int i=0;i<t;i++)
//        {
//
//            try
//            {
//                long x=sc.nextLong();
//                System.out.println(x+" can be fitted in:");
//                if(x>=-128 && x<=127)System.out.println("* byte");
//                //Complete the code
//                if(x == (short)x)System.out.println("* short");
//                if(x == (int)x)System.out.println("* int");
//                if(x == (long)x)System.out.println("* long");
//            }
//            catch(Exception e)
//            {
//                System.out.println(sc.next()+" can't be fitted anywhere.");
//            }
//
//        }
//    }
//}





//Sample Input
//
//        Hello world
//        I am a file
//        Read me until end-of-file.

//public class Solution {
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner in = new Scanner(System.in);
//
//        int count = 1;
//
//        while(in.hasNext()){
//            String a = in.nextLine();
//            System.out.println(count + " " + a);
//            count++;
//        }
//    }
//}



//If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
// Write your code here
//
//static boolean flag = false;
//
//static int B;
//static int H;
//
//static{
//        Scanner in = new Scanner(System.in);
//        B=in.nextInt();
//        H=in.nextInt();
//        if(B<=0 || H <=0){
//        System.out.println("java.lang.Exception: Breadth and height must be positive");
//        }else{
//        flag = true;
//        }
//        }
//
//
//
//public static void main(String[] args){
//        if(flag){
//        int area=B*H;
//        System.out.print(area);
//        }
//
//        }//end of main
//
//        }//end of class



//If n = String
//public class Solution {
//    public static void main(String[] args) {
//
//        DoNotTerminate.forbidExit();
//
//        try {
//            Scanner in = new Scanner(System.in);
//            int n = in .nextInt();
//            in.close();
//            //String s=???; Complete this line below
//
//            //Write your code here
//
//            String s = String.valueOf(n);
//
//            if (n == Integer.parseInt(s)) {
//                System.out.println("Good job");
//            } else {
//                System.out.println("Wrong answer.");
//            }
//        } catch (DoNotTerminate.ExitTrappedException e) {
//            System.out.println("Unsuccessful Termination!!");
//        }
//    }
//}
//
////The following class will prevent you from terminating the code using exit(0)!
//class DoNotTerminate {
//
//    public static class ExitTrappedException extends SecurityException {
//
//        private static final long serialVersionUID = 1;
//    }
//
//    public static void forbidExit() {
//        final SecurityManager securityManager = new SecurityManager() {
//            @Override
//            public void checkPermission(Permission permission) {
//                if (permission.getName().contains("exitVM")) {
//                    throw new ExitTrappedException();
//                }
//            }
//        };
//        System.setSecurityManager(securityManager);
//    }
//}



//Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:
//
//        US: formattedPayment
//        India: formattedPayment
//        China: formattedPayment
//        France: formattedPayment
//        where  is  formatted according to the appropriate Locale's currency.

//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//
//        // Write your code here.
//
//        NumberFormat usnf = NumberFormat.getCurrencyInstance(Locale.US);
//        NumberFormat indianf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
//        NumberFormat chinanf = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        NumberFormat francenf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//        String us = usnf.format(payment);
//        String india = indianf.format(payment);
//        String china = chinanf.format(payment);
//        String france = francenf.format(payment);
//
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
//    }
//}




//Given a string, matching the regular expression [A-Za-z !,?._'@]+,
//        split the string into tokens. We define a token to be one or more consecutive English alphabetic letters.
//        Then, print the number of tokens, followed by each token on a new line.

//public class solution {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        // Write your code here.
//        String a = s.replaceAll("^\\s+","");
//        String[] stringarray = a.split("[!,? ._'@]+");
//        int count = stringarray.length;
//        System.out.println(count);
//        for (String value : stringarray) {
//            System.out.println(value);
//        }
//        scan.close();
//    }
//}

//        Sum the lengths of A and B.
//        Determine if A is lexicographically larger than B (i.e.: does A come before B in the dictionary?).
//        Capitalize the first letter in A and B and print them on a single line, separated by a space.
//
//
//public class solution {
//
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//
//        int sum = (A.length() + B.length());
//
//        String aCap = A.substring(0, 1).toUpperCase() + A.substring(1);
//        String bCap = B.substring(0, 1).toUpperCase() + B.substring(1);
//
//        System.out.println(sum);
//        if(A.compareTo(B) < 0){
//            System.out.println("No");
//        }else{
//            System.out.println("Yes");
//        }
//        System.out.println(aCap + " " + bCap);
//    }
//}






//Print the substring in the inclusive range from Start to End -1.

//public class solution {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String S = in.next();
//        int start = in.nextInt();
//        int end = in.nextInt();
//
//        System.out.println(S.substring(start, (end)));
//    }
//}





//class Result {
//
//    /*
//     * Complete the 'lonelyinteger' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts INTEGER_ARRAY a as parameter.
//     */
//
//    public static int lonelyinteger(List<Integer> a) {
//        // Write your code here
//        int b = 0;
//        for(int i = 0; i <= a.size(); i++){
//
//            return (int b);
//        }
//    }
//
//}




//Return the absolute difference between the sums of the matrix's two diagonals as a single integer.
/*
class Result {*/

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
//
//    public static int diagonalDifference(List<List<Integer>> arr) {
//        // Write your code here
//
//    }
//
//}

//class solution {
//    int n;
//    public int find(int[] A) {
//        // write your code in Java SE 8
//        for(int i = 0; i <= A.length; i++){
//            if(i > i - 1){
//                int n = i;
//            }
//        }
//    }
//}




// you can also use imports, for example:
//import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

//class solution {
//
//    public int solution(int[] A) {
//        int n = 1;
//        Arrays.sort(A);
//        if (A[A.length - 1] <= 0) return n;
//        if (A[0] > 1) return n;
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] == n) {
//                n++;
//            }
//        }
//        return(n);
//    }
//}



//
//In each line of output there should be two columns:
//        The first column contains the String and is left justified using exactly 15 characters.
//        The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

public class solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
        }
        System.out.println("================================");

    }
}