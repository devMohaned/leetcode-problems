class Solution:
    def climbStairs(self, n: int) -> int:
        dp = [0] * (n + 1)
        for i in range(1, n + 1):
            temp = 0
            for step in range(1,3):
                if(i - step > 0):
                    temp += dp[i - step]
                elif i - step == 0:
                    temp += 1
                dp[i] = temp
        return dp[n]        