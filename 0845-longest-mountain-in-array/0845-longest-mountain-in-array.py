class Solution:
    def longestMountain(self, arr: List[int]) -> int:
        longestRange = 0
        length = len(arr)
        for i in range(1, length - 1):
            if arr[i-1] < arr[i] > arr[i+1]:
                l, r = i-1, i+1
                while(l > 0 and arr[l-1] < arr[l]):
                    l -= 1
                while(r < length - 1 and arr[r+1] < arr[r]):
                    r += 1
            
                longestRange = max(longestRange, (r - l + 1))

        return longestRange
        