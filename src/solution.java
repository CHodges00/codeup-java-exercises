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
