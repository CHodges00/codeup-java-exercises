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

//public class solution {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("================================");
//        for (int i = 0; i < 3; i++) {
//            String s1 = sc.next();
//            int x = sc.nextInt();
//            //Complete this line
//
//            if (x == 0) {
//                System.out.printf("%-13.13s  %-13.13s%n", s1, "00" + x);
//            } else if (x < 100) {
//                System.out.printf("%-13.13s  %-13.13s%n", s1, "0" + x);
//            } else {
//                System.out.printf("%-13.13s  %-13.13s%n", s1, x);
//            }
//
//        }
//        System.out.println("================================");
//
//    }
//}








//Given a string A, print Yes if it is a palindrome, print No otherwise.


//public class solution {
//
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        /* Enter your code here. Print output to STDOUT. */
//        String rev = "";
//
//        // Initializing a new boolean variable for the
//        // answer
//        boolean ans = false;
//
//        for (int i = A.length() - 1; i >= 0; i--) {
//            rev = rev + A.charAt(i);
//        }
//
//        // Checking if both the strings are equal
//        if (A.equals(rev)) {
//            ans = true;
//        }
//
//        System.out.println(ans);
//    }
//}







//Check if two String inputs are Anagrams

//public class solution {
//
//    static boolean isAnagram(String a, String b) {
//        // Complete the function
//        if (a.length() != b.length()) {
//            return false;
//        }
//        int count[] = new int[256];
//        for (int i = 0; i < a.length(); i++) {
//            count[a.toLowerCase().charAt(i)]++;
//            count[b.toLowerCase().charAt(i)]--;
//        }
//        for (int i = 0; i < 256; i++) {
//            if (count[i] != 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
//        boolean ret = isAnagram(a, b);
//        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//    }
//}





//        Given a string S , matching the regular expression [A-Za-z !,?._'@]+,
//        split the string into tokens. We define a token to be one or more consecutive English alphabetic letters.
//        Then, print the number of tokens, followed by each token on a new line.


//public class solution {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        if(s == " "){
//            System.out.println(0);
//        }
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









//  For each test case, print Valid if the syntax of the given pattern is correct.
//  Otherwise, print Invalid. Do not print the quotes.


//public class solution
//{
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//        while(testCases>0){
//            String pattern = in.nextLine();
//            //Write your code
//            System.out.println(pattern);
//            testCases--;
//        }
//    }
//}










//        You are updating the username policy on your company's internal networking platform. According to the policy,
//        a username is considered valid if all the following constraints are satisfied:
//
//    The username consists of  to  characters inclusive. If the username consists of less than  or greater than  characters, then it is an invalid username.
//    The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters,
//      uppercase characters , and digits .
//    The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .

//class UsernameValidator {
//    /*
//     * Write regular expression here.
//     */
//    public static final String regularExpression = "^[a-zA-Z]([_]|[a-zA-Z0-9]){7,29}$";
//}
//
//
//public class solution {
//    private static final Scanner scan = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int n = Integer.parseInt(scan.nextLine());
//        while (n-- != 0) {
//            String userName = scan.nextLine();
//
//            if (userName.matches(UsernameValidator.regularExpression)) {
//                System.out.println("Valid");
//            } else {
//                System.out.println("Invalid");
//            }
//        }
//    }
//}









//In each line, output the number located in Yth position of Xth line. If there is no such position, just print "ERROR!"


//public class solution {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<List<Integer>> list = new ArrayList<>();
//
//        int n = sc.nextInt();
//
//        while(n > 0){
//            int l = sc.nextInt(); //Number of integers in single line
//
//            List<Integer> arr =new ArrayList<>(); //Create array list
//
//            while(l!= 0 ){
//                arr.add(sc.nextInt());
//                l--;
//            }
//
//            list.add(arr);
//            n--;
//        }
//        int query = sc.nextInt();
//        while(query!= 0){
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            try {
//                System.out.println(list.get(x-1).get(y-1));
//            }
//            catch (Exception e){
//                System.out.println("ERROR!");
//            }
//            query--;
//        }
//    }
//}












//        Given a list, L , of N integers, perform Q queries on the list.
//        Once all queries are completed, print the modified list as a single line of space-separated integers.

//public class solution {
//
//    public static void main(String[] args) {
//
//        final Scanner in = new Scanner(System.in);
//
//        final int size = in.nextInt();
//
//        final List<Integer> list = new LinkedList<>();
//        for (int i = 0; i < size; i++) {
//            list.add(in.nextInt());
//        }
//
//        final int commandCount = in.nextInt();
//        for (int i = 0; i < commandCount; i++) {
//            in.nextLine();
//            String command = in.nextLine();
//            if (command.equals("Insert")) {
//                int index = in.nextInt();
//                int value = in.nextInt();
//                list.add(index, value);
//            } else {
//                int index = in.nextInt();
//                list.remove(index);
//            }
//        }
//
//        int count = 0;
//        for (Integer number : list) {
//            System.out.print(number);
//            if (count != list.size() - 1) {
//                System.out.print(" ");
//            }
//            count++;
//        }
//    }
//}









//
//        The first line will have an integer N denoting the number of entries in the phone book.
//        Each entry consists of two lines: a name and the corresponding phone number.
//          For each case, print "Not found" if the person has no entry in the phone book.
//          Otherwise, print the person's name and phone number. See sample output for the exact format.


class solution {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
        }


    }
}













//    public static boolean canWin(int leap, int[] game) {
//
//        int[] directions = new int[]{1,-1,leap};
//
//        LinkedList<Integer> arr = new LinkedList<>();
//        arr.add(0);
//
//        int i = 0;
//        while(!arr.isEmpty()) {
//            game[i] = 1;
//            i = arr.poll();
//            for(int d = 0; d < directions.length; d++) {
//                int c = i + directions[d];
//                if(c >= game.length) return true;
//                if(c >= 0 && game[c]==0) {
//                    arr.add(c);
//                }
//            }
//        }
//
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int q = scan.nextInt();
//        while (q-- > 0) {
//            int n = scan.nextInt();
//            int leap = scan.nextInt();
//
//            int[] game = new int[n];
//            for (int i = 0; i < n; i++) {
//                game[i] = scan.nextInt();
//            }
//
//            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
//        }
//        scan.close();
//    }
//}

