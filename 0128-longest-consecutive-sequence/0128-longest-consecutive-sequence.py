class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if(not nums):
            return 0
        
        
        existingSet = set()

        for num in nums:
            existingSet.add(num)

        longest = 0
        currentLongest = 1
        for num in existingSet:
            if num - 1 not in existingSet:
                current = num
                while current+1 in existingSet:
                    currentLongest += 1
                    current += 1
                longest = max(longest, currentLongest)
                currentLongest = 1
        return longest
            


        