class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # [-4,-1,-1,0,1,2]
        triplet = []
        nums.sort()

        for index, current in enumerate(nums):
            left = index + 1
            right = len(nums) - 1

            if(index > 0 and nums[index - 1] == current):
                continue

            while(left < right):
                sum = current + nums[left] + nums[right] # -1 + 0 + 1 > 0
                if(sum == 0):
                    triplet.append((current,nums[left],nums[right]))
                    left += 1
                    while(left < right and nums[left] == nums[left - 1]):
                        left += 1
                elif(sum > 0):
                    right -= 1
                elif(sum < 0):
                    left += 1
            
        return triplet


        