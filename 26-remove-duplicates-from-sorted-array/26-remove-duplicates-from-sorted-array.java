class Solution {
    public int removeDuplicates(int[] nums) {
     int prev = nums[0];
        int lastIndex = 0;
    
        for(int i = 1; i < nums.length;i++){
        if(nums[i] == prev) continue;
            prev = nums[i];
            nums[++lastIndex] = nums[i];
        }
        return ++lastIndex;
    }
}