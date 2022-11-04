class Solution {
    public int searchInsert(int[] nums, int target) {
        int leftIdx = 0;
        int rightIdx = nums.length - 1;
         int middleIdx = rightIdx/2;
        while(leftIdx <= rightIdx)
        {
            middleIdx = (leftIdx + rightIdx)/2;
            if(nums[middleIdx] == target)return middleIdx;
            else if(nums[middleIdx] < target)leftIdx = middleIdx +1;
            else rightIdx = middleIdx - 1;
        }
        return leftIdx;
    }
}