class Solution {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        
        int i = 0;
        for(int number : nums)
        {
            result[i] = nums[number];
                i++;
        }
        return result;
    }
}