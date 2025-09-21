class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        l = 0
        result = float('inf')
        total = 0

        for r in range(0, len(nums)):
            total += nums[r]

            while(total >= target):
                total -= nums[l]
                result = min(result, r - l + 1)
                l += 1
        if(result == float('inf')):
            return 0
        else:
            return result
        