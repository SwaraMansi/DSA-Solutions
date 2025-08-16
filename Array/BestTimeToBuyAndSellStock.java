// LeetCode 121: Best Time to Buy and Sell Stock (Array)
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, profit = 0;
        for (int p : prices) {
            if (p < min) min = p;
            else if (p - min > profit) profit = p - min;
        }
        return profit;
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock s = new BestTimeToBuyAndSellStock();
        System.out.println(s.maxProfit(new int[]{7,1,5,3,6,4})); // 5
    }
}
