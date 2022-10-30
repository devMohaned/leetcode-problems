class Solution {
    public int maxProfit(int[] prices) {
        int prevBoughtOrSellingPrice = Integer.MAX_VALUE;
        int profit = 0;
        int possibleProfit = 0;
        
        for(int i = 0; i < prices.length; i++){
            int buyingPrice = prices[i];
            if(buyingPrice < prevBoughtOrSellingPrice){
                prevBoughtOrSellingPrice = buyingPrice;
            }
            possibleProfit = buyingPrice - prevBoughtOrSellingPrice;
            if(profit < possibleProfit){
                profit = possibleProfit;
            }
        }
        return profit;
    }
}