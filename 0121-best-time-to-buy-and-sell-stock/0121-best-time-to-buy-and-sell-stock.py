class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left, right = 0,0
        maxProfit = 0
        while(right != len(prices)):
            leftPrice = prices[left]
            rightPrice = prices[right]
            if(leftPrice < rightPrice):
                profit = rightPrice - leftPrice 
                maxProfit = max(profit, maxProfit)
            else:
                left = right
            right += 1
        return maxProfit
        