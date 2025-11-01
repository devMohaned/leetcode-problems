class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left = 0
        right = len(heights) - 1

        maxArea = float('-inf')
        while(left < right):
            width = right - left
            lowerOfBoth = heights[left] if heights[left] < heights[right] else heights[right]
            area = lowerOfBoth * width 
            maxArea = max(area, maxArea)
            left += 1

        left = 0
        while(right >= 0):
            width = right - left
            lowerOfBoth = heights[left] if heights[left] < heights[right] else heights[right]
            area = lowerOfBoth * width 
            maxArea = max(area, maxArea)
            right -= 1

        right = len(heights)- 1
        while(left < right):
            width = right - left
            area = min(heights[left], heights[right]) * width
            maxArea = max(area, maxArea)
            if heights[left] > heights[right]:
                right -=1
            else:
                left +=1

        return maxArea
            
