import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Permission;
import java.text.NumberFormat;
import java.util.Locale;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
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


//class solution{
//    public static void main(String []argh){
//        Scanner in = new Scanner(System.in);
//        int n=Integer.parseInt(in.nextLine());
//        HashMap<String,Integer> data = new HashMap<>();
//        for(int i=0;i<n;i++)
//        {
//            String name=in.nextLine();
//            int phone=Integer.parseInt(in.nextLine());
//            data.put(name, phone);
//        }
//        while(in.hasNext())
//        {
//            String s=in.nextLine();
//            System.out.println(data.containsKey(s)?s+"="+data.get(s):"Not found");
//
//        }
//    }
//}


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


//
//        IP address is a string in the form "A.B.C.D",
//        where the value of A, B, C, and D may range from 0 to 255.
//        Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.


//class solution{
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            String IP = in.next();
//            System.out.println(IP.matches(new MyRegex().pattern));
//        }
//
//    }
//}
//
//class MyRegex {
//    String pattern = "^(((2[0-4][0-9]|25[0-5]|[01]?[0-9]{1,2})\\.){3})(25[0-5]|2[0-4][0-9]|[01]?[0-9]{1,2})$";
//}


//Given a string, S , and an integer, K , complete the function so that it finds the lexicographically smallest and largest substrings of length K.


//public class solution {
//
//    public static String getSmallestAndLargest(String s, int k) {
//
//        // Complete the function
//        // 'smallest' must be the lexicographically smallest substring of length 'k'
//
//        // 'largest' must be the lexicographically largest substring of length 'k'
//        int n = s.length();
//        String smallest = s.substring(0,k);
//        String largest =s.substring(0,k);
//
//        for(int i = 0;i<n-k+1;i++){
//            String temp = s.substring(i,i+k);
//            largest = largest.compareTo(temp)>0?largest:temp;
//            smallest = smallest.compareTo(temp)<0?smallest:temp;
//        }
//
//        return smallest + "\n" + largest;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();
//
//        System.out.println(getSmallestAndLargest(s, k));
//    }
//}


//        Using Regex, we can easily match or search for patterns in a text.
//        Before searching for a pattern, we have to specify one using some well-defined syntax.
//        In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.


//public class solution
//{
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//        while(testCases>0){
//            String pattern = in.nextLine();
//            //Write your code
//            if (pattern != null && !pattern.equals("")) {
//                try {
//                    Pattern.compile(pattern);
//                    System.out.println("Valid");
//                } catch (PatternSyntaxException exception) {
//                    System.out.println("Invalid");
//                }
//            }
//            testCases--;
//        }
//    }
//}


//******* PRACTICE ******* This took entirely too long..........

//        To solve this challenge, complete the following three lines:
//        Write a RegEx that will match any repeated word.
//        Complete the second compile argument so that the compiled RegEx is case-insensitive.
//        Write the two necessary arguments for replaceAll such that each repeated word is replaced with
//        the very first instance the word found in the sentence. It must be the exact first occurrence of the word, as the expected output is case-sensitive.

//public class solution {
//
//    public static void main(String[] args) {
//
//        String regex = "\\b(\\w+)(\\s+\\1)*\\b";
//        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
//
//        Scanner in = new Scanner(System.in);
//        int numSentences = Integer.parseInt(in.nextLine());
//
//        while (numSentences-- > 0) {
//            String input = in.nextLine();
//
//            Matcher m = p.matcher(input);
//
//            // Check for subsequences of input that match the compiled pattern
//            while (m.find()) {
//                input = input.replaceAll(m.group(),
//                        m.group(1));
//            }
//
//            // Prints the modified sentence.
//            System.out.println(input);
//        }
//
//        in.close();
//    }
//}


//
//        For each line, print the content enclosed within valid tags.
//        If a line contains multiple instances of valid content, print out each instance of valid content on a new line;
//        if no valid content is found, print None.


//public class solution{
//    public static void main(String[] args){
//
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//        while(testCases>0){
//            String line = in.nextLine();
//
//            //Write your code here
//            String regexPattern = "<(.+)>([\\w]+[^<]*)</(\\1)>";
//            Pattern p = Pattern.compile(regexPattern);
//            Matcher m = p.matcher(line);
//            int count = 0;
//
//            while(m.find())
//            {
//                // System.out.println(m.group(0)); // get <h1>...</h1>
//                // System.out.println(m.group(1)); // get the text inside the tag
//                System.out.println(m.group(2)); // get the text between <x> </x>
//                count++;
//            }
//            if(count == 0){
//                System.out.println("None");
//            }
//
//            testCases--;
//        }
//    }
//}


//        PerformOperation isOdd(): The lambda expression must return true if a number is odd or false if it is even.
//        PerformOperation isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
//        PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not.


//interface PerformOperation {
//    boolean check(int a);
//}
//
//class MyMath {
//    public static boolean checker(PerformOperation p, int num) {
//        return p.check(num);
//    }
//
//    // Write your code here
//    public PerformOperation isOdd() {
//        return (n) -> (n % 2 != 0);
//    }
//
//    public PerformOperation isPrime() {
//        return (n) -> {
//            for (int i = 2; i * i <= n; i++) {
//                if (n % i == 0) {
//                    return false;
//                }
//            }
//
//            return true;
//        };
//    }
//
//    public PerformOperation isPalindrome() {
//        return (n) -> {
//            int temp = n;
//            int result = 0;
//            while (n > 0) {
//                int digit = n % 10;
//                result = (result * 10) + digit;
//                n /= 10;
//            }
//
//            return temp == result;
//        };
//    }
//}
//
//public class solution {
//
//    public static void main(String[] args) throws IOException {
//        MyMath ob = new MyMath();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//        PerformOperation op;
//        boolean ret = false;
//        String ans = null;
//        while (T-- > 0) {
//            String s = br.readLine().trim();
//            StringTokenizer st = new StringTokenizer(s);
//            int ch = Integer.parseInt(st.nextToken());
//            int num = Integer.parseInt(st.nextToken());
//            if (ch == 1) {
//                op = ob.isOdd();
//                ret = ob.checker(op, num);
//                ans = (ret) ? "ODD" : "EVEN";
//            } else if (ch == 2) {
//                op = ob.isPrime();
//                ret = ob.checker(op, num);
//                ans = (ret) ? "PRIME" : "COMPOSITE";
//            } else if (ch == 3) {
//                op = ob.isPalindrome();
//                ret = ob.checker(op, num);
//                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
//
//            }
//            System.out.println(ans);
//        }
//    }
//}












//Print the MD5 encryption value of S on a new line.
//---JAVA 15 solution from discussion page


//import java.io.*;
//import java.util.*;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//
//public class solution {
//    public static void main(String[] args) throws NoSuchAlgorithmException {
//        var str = new Scanner(System.in).next();
//
//        var md = MessageDigest.getInstance("MD5");
//        md.update(str.getBytes());
//        var digest = md.digest();
//
//        for (byte b : digest) {
//            System.out.format("%02x", b);
//        }
//    }
//}








//Your task is to write a regular expression that matches only and exactly strings of form: abc.def.ghi.jkx
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//public class solution {
//
//    public static void main(String[] args) {
//
//        Tester tester = new Tester();
//        tester.check("^.{3}\\..{3}\\..{3}\\..{3}$");
//
//    }
//}
//
//class Tester {
//
//    public void check(String pattern){
//
//        Scanner scanner = new Scanner(System.in);
//        String testString = scanner.nextLine();
//        Pattern p = Pattern.compile(pattern);
//        Matcher m = p.matcher(testString);
//        boolean match = m.matches();
//
//        System.out.format("%s", match);
//    }
//
//}




//You have a test string S. Your task is to match the pattern xxXxxXxxxx
//Here x denotes a digit character, and X denotes a non-digit character.

//public class solution {
//
//    public static void main(String[] args) {
//
//        Regex_Test tester = new Regex_Test();
//        tester.checker("(\\d{2}\\D){2}\\d{4}"); // Use \\ instead of using \
//
//    }
//}
//
//class Regex_Test {
//
//    public void checker(String Regex_Pattern){
//
//        Scanner Input = new Scanner(System.in);
//        String Test_String = Input.nextLine();
//        Pattern p = Pattern.compile(Regex_Pattern);
//        Matcher m = p.matcher(Test_String);
//        System.out.println(m.find());
//    }
//
//}






//        You have a test string S. Your task is to match the pattern XXxXXxXX
//        Here, x denotes whitespace characters, and X denotes non-white space characters.

//public class solution {
//
//    public static void main(String[] args) {
//
//        Regex_Test tester = new Regex_Test();
//        tester.checker("(\\S{2}\\s){2}\\S{2}");
//
//    }
//}
//
//class Regex_Test {
//
//    public void checker(String Regex_Pattern){
//
//        Scanner Input = new Scanner(System.in);
//        String Test_String = Input.nextLine();
//        Pattern p = Pattern.compile(Regex_Pattern);
//        Matcher m = p.matcher(Test_String);
//        System.out.println(m.find());
//    }
//
//}








//        You have a test string S. Your task is to match the pattern xxxXxxxxxxxxxxXxxx
//        Here x denotes any word character and X denotes any non-word character.

//public class solution {
//
//    public static void main(String[] args) {
//
//        Regex_Test tester = new Regex_Test();
//        tester.checker("\\w{3}\\W\\w{10}\\W\\w{3}"); // Use \\ instead of using \
//
//    }
//}
//
//class Regex_Test {
//
//    public void checker(String Regex_Pattern){
//
//        Scanner Input = new Scanner(System.in);
//        String Test_String = Input.nextLine();
//        Pattern p = Pattern.compile(Regex_Pattern);
//        Matcher m = p.matcher(Test_String);
//        System.out.println(m.find());
//    }
//
//}








//        You have a test string S. Your task is to match the pattern Xxxxx
//        Here, x denotes a word character, and X denotes a digit.
//        S must start with a digit X and end with . symbol.
//        S should be 6 characters long only.

//public class solution {
//
//    public static void main(String[] args) {
//
//        Regex_Test tester = new Regex_Test();
//        tester.checker("^\\d\\w{4}\\.$"); // Use \\ instead of using \
//
//    }
//}
//
//class Regex_Test {
//
//    public void checker(String Regex_Pattern){
//
//        Scanner Input = new Scanner(System.in);
//        String Test_String = Input.nextLine();
//        Pattern p = Pattern.compile(Regex_Pattern);
//        Matcher m = p.matcher(Test_String);
//        System.out.println(m.find());
//    }
//
//}







import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;


//class Result {
//
//    /*
//     * Complete the 'eval_algebraic' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts following parameters:
//     *  1. STRING expr
//     *  2. INTEGER val
//     */
//
//    public static int eval_algebraic(String expr, int val) {
//    expr = "3x + 7";
//    val = 3;
//
//    char[] chars = expr.toCharArray();
//
//    int x = 1;
//    return x;
//    }
//}
//public class solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String expr = bufferedReader.readLine();
//
//        int val = Integer.parseInt(bufferedReader.readLine().trim());
//
//        int result = Result.eval_algebraic(expr, val);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}

//public class solution {
//
//
//    public static void main(String[] args) {
//        String expr = "2x + 3";
//        int val = 5;
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i = 0; i < expr.length(); i++){
//            arr.add(i);
//        }
//
//        System.out.println(arr);
//    }
//}







//        Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
//        Then print the respective minimum and maximum values as a single line of two space-separated long integers.
import static java.util.stream.Collectors.toList;
//
//class Result {
//
//    /*
//     * Complete the 'miniMaxSum' function below.
//     *
//     * The function accepts INTEGER_ARRAY arr as parameter.
//     */
//
//    public static void miniMaxSum(List<Integer> arr) {
//        // Write your code here
//        long min = 0;
//        long max = 0;
//
//        Collections.sort(arr);
//        // System.out.println(arr);
//
//        for(int i=0;i<arr.size()-1;i++){
//            min += arr.get(i);
//        }
//        for(int i=1;i<arr.size();i++){
//            max += arr.get(i);
//        }
//
//        System.out.println(min + " " + max);
//    }
//
//}
//
//public class solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        Result.miniMaxSum(arr);
//
//        bufferedReader.close();
//    }
//}






//Given an array of integers, where all elements but one occur twice, find the unique element.

//class Result {
//    public static int lonelyinteger(List<Integer> a) {
//
//        int uniq = 0;
//
//        for (int i=0; i<a.size(); i++){
//            uniq = a.get(i);
//            a.remove(i);
//            if (!a.contains(uniq))
//                return uniq;
//            a.add(i, uniq);
//        }
//        return uniq;
//    }
//}
//
//
//
//public class solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int result = Result.lonelyinteger(a);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}








//Given a square matrix, calculate the absolute difference between the sums of its diagonals.


class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

    }

}

public class solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}