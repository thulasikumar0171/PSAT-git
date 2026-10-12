public class MaximumProfitAnalyzer {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        System.out.println("Stock Prices: 7 1 5 3 6 4");
        System.out.println("Maximum Profit: " + maxProfit);
    }
}

Input: 
Stock Prices: 7 1 5 3 6 4
Stock Prices: 7 1 5 3 6 4

Output:

Stock Prices: 7 1 5 3 6 4
Maximum Profit: 5