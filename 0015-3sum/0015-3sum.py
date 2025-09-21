class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        triplets = []
        nums.sort()
        
        for index, current in enumerate(nums):
            left = index + 1
            right = len(nums) - 1
            
            if index > 0 and current == nums[index-1]:
                continue

            while(left < right):
                leftValue = nums[left]
                rightValue = nums[right]
                calculatedSum = current + leftValue + rightValue
                if calculatedSum > 0:
                    right -=1
                elif calculatedSum < 0:
                    left += 1
                else:
                    triplets.append([current, leftValue, rightValue])
                    left += 1
                    while(left < right and nums[left] == nums[left - 1]):
                        left += 1

        return triplets
        