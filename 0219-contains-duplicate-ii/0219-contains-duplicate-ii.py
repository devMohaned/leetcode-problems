class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        seenOfSizeK = set()
        for i in range(0, len(nums)):
            if(nums[i] in seenOfSizeK):
                return True
            seenOfSizeK.add(nums[i])
            if(len(seenOfSizeK) > k):
                seenOfSizeK.remove(nums[i - k])
        return False

        