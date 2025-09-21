class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        def backtrack(start, end):
            if start == end:
                result.append(nums[:])
            for i in range(start, end):
                nums[i], nums[start] = nums[start], nums[i]
                backtrack(start + 1, end)
                nums[i], nums[start] = nums[start], nums[i]

        result = []
        backtrack(0, len(nums))
        return result
        