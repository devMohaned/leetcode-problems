class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()

        for index, current in enumerate(nums):
            if(index > 0 and current == nums[index - 1]):
                continue
            
            left = index + 1
            right = len(nums) - 1
            while(left < right):
                leftValue = nums[left]
                rightValue = nums[right]

                sum = current + leftValue + rightValue
                if(sum == 0):
                    result.append((current, leftValue, rightValue))
                    left += 1
                    while(left < right and nums[left] == nums[left - 1]):
                        left +=1
                elif(sum > 0):
                    right -= 1
                elif(sum < 0):
                    left += 1
        return result