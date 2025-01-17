package LeetCode;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int min_buying = Integer.MAX_VALUE;
        int max_profit  = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < min_buying){
                min_buying = prices[i];
            } else {
                int current_profit = prices[i] - min_buying;
                if (current_profit > max_profit){
                    max_profit = current_profit;
                }
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        MaxProfit mp = new MaxProfit();
        System.out.println(mp.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
