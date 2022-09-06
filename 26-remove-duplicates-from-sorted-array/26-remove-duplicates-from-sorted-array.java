class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1)
            return 1;
        
        int prev = nums[0];
        int lastIndex = 0;
    
        for(int i = 1; i < nums.length;i++)
        {
        if(nums[i] == prev) continue;
            prev = nums[i];
            nums[++lastIndex] = nums[i];
 }
        return lastIndex+1;
    }
}