class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        remainingMap = dict()

        for i,number in enumerate(nums):
            remaining = target - number
            if(remaining in remainingMap):
                return [remainingMap[remaining],i]
            remainingMap[number] = i
        return []