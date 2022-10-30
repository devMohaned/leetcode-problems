class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1)
            return false;
        else if(nums.length == 2 && nums[0] != nums[1])
            return false;
        else if(nums.length == 2 && nums[0] == nums[1])
            return true;
        
        Arrays.sort(nums);
        int prev = nums[0];
        
        int i = 1;
        while(i < nums.length){
            
            int num = nums[i];
            if(prev != num)
                prev = num;
            else
                return true;
            i++;
        }
        return false;
    }
}