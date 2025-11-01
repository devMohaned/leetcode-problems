class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left = 0
        right = len(heights) - 1
        maxArea = float('-inf')

        while(left < right):
            width = right - left
            area = min(heights[left], heights[right]) * width
            maxArea = max(area, maxArea)
            if heights[left] > heights[right]:
                right -=1
            else:
                left +=1

        return maxArea
            
