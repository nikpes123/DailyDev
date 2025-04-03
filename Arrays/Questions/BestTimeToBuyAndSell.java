package Arrays.Questions;
/** 
 * LeetCode Question: 121
 * Difficulty: Easy
 * Problem: Best Time To Buy and Sell
 */
public class BestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {
        // Initialize the variable to track the minimum buying price
        int min_buying = Integer.MAX_VALUE;
        
        // Initialize the variable to track the maximum profit
        int max_profit  = 0;
        
        // Loop through the array of prices
        for (int i = 0; i < prices.length; i++) {
            // If the current price is lower than the previously found minimum, update the minimum buying price
            if (prices[i] < min_buying) {
                min_buying = prices[i];
            } else {
                // Otherwise, calculate the profit if we sold on this day
                int current_profit = prices[i] - min_buying;
                
                // If the current profit is greater than the maximum profit so far, update the maximum profit
                if (current_profit > max_profit) {
                    max_profit = current_profit;
                }
            }
        }
        
        // Return the maximum profit
        return max_profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSell mp = new BestTimeToBuyAndSell();
        
        // Example input: prices = [7,1,5,3,6,4]
        // Expected output: 5, since buying at 1 and selling at 6 gives a profit of 5
        System.out.println(mp.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
