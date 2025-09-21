class NumArray:

    def __init__(self, nums: List[int]):
        self.dp = [0] * (len(nums) + 1)
        i = 0
        self.dp[i] = 0

        for num in nums:
            i += 1
            self.dp[i] = self.dp[i-1] + num

    def sumRange(self, left: int, right: int) -> int:
        return self.dp[right + 1] - self.dp[left]
        
        


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)