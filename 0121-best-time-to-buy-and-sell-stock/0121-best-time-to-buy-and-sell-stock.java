class Solution {
    public int maxProfit(int[] prices) {
        int prevBoughtPrice = Integer.MAX_VALUE;
        int profit = 0;
        int possibleProfit = 0;
        
        for(int i = 0; i < prices.length; i++){
            int boughtPrice = prices[i];
            if(boughtPrice < prevBoughtPrice){
                prevBoughtPrice = boughtPrice;
            }
            possibleProfit = boughtPrice - prevBoughtPrice;
            if(profit < possibleProfit){
                profit = possibleProfit;
            }
        }
        return profit;
    }
}