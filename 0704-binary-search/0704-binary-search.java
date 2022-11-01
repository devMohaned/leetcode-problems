class Solution {
    public int search(int[] nums, int target) {
        int N = nums.length;
        int leftIdx = 0;
        int rightIdx = N - 1;
        int middle = rightIdx/2;
        
        while(leftIdx <= rightIdx)
        {
            middle = (leftIdx + rightIdx)/2;
            if(nums[middle] == target)return middle;
            else if(nums[middle] > target)rightIdx = middle - 1;
            else if(nums[middle] < target)leftIdx = middle + 1;
        }
        return -1;
    }
    
}