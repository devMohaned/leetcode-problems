class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        remainingMap = {}

        for i,number in enumerate(numbers):
            remaining = target - number
            if(remaining in remainingMap):
                return [remainingMap[remaining], i + 1]
            remainingMap[number] = i + 1
        return [0,0]