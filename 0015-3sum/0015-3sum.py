class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()



        for index, current in enumerate(nums):
            left = index + 1
            right = len(nums) - 1
            
            if(index > 0 and nums[index] == nums[index - 1]):
                continue

            while(left < right):
                sum = nums[left] + nums[right] + current
                if(sum == 0):
                    result.append((nums[index],nums[left],nums[right]))
                    left+=1
                    while(left < right and nums[left] == nums[left - 1]):
                        left += 1
                elif(sum > 0):
                    right -=1
                else:
                    left+=1
        return result
        