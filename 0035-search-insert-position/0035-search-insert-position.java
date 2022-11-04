class Solution {
    public int searchInsert(int[] nums, int target) {
        int leftIdx = 0;
        int rightIdx = nums.length - 1;
        while(leftIdx <= rightIdx)
        {
           int middleIdx = (leftIdx + rightIdx)/2;
            if(nums[middleIdx] > target)rightIdx = middleIdx - 1 ;
            else if(nums[middleIdx] < target)leftIdx = middleIdx +1;
            else return middleIdx;
        }
        return leftIdx;
    }
}