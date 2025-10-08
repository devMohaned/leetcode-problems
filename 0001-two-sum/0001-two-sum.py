class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        found = {}
        for i,num in enumerate(nums):
            remaining = target - num
            if remaining in found:
                return [i, found[remaining]]
            found[num] = i
        return False
        