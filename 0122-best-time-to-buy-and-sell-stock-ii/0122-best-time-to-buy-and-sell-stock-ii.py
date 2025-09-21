class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        for i in range(1,len(prices)):
            currentPrice = prices[i]
            priceBefore = prices[i-1]
            if(currentPrice > priceBefore):
                profit += currentPrice - priceBefore
        return profit