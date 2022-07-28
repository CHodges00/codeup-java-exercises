import java.security.Permission;
import java.text.NumberFormat;
import java.util.Locale;
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