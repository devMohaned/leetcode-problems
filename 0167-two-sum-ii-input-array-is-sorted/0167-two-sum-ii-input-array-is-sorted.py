class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left,right = 0, len(numbers) - 1
        while(left < right):
            le,ri = numbers[left], numbers[right]
            if(target == le + ri):
                return [left+1, right+1]
            elif(target > le+ri):
                left += 1
            elif(target < le+ri):
                right -= 1

        return [0,0]