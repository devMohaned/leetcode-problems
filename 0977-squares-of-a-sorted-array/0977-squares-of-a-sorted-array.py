class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        result = deque()
        left = 0
        right = len(nums) - 1
        while (left <= right):
            leftValue = abs(nums[left])
            rightValue = abs(nums[right])
            if(leftValue < rightValue):
                result.appendleft(rightValue ** 2)
                right -=1
            else:
                result.appendleft(leftValue ** 2)
                left +=1
        return list(result)

            
        