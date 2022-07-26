public class solution {



    public static void main(String[] args) {
        int[] prices = new int[6];
        int max = 0;
        int min = Integer.MAX_VALUE;
        prices[0] = 3;
        prices[1] = 6;
        prices[2] = 5;
        prices[3] = 4;
        prices[4] = 9;
        prices[5] = 2;

        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                max = Math.max(max, price - min);
            }
        }
        System.out.println(max);
    }
}
