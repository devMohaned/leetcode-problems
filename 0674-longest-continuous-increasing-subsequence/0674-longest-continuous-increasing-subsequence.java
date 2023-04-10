class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int size = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) size++;
            else size = 1;
            max = Math.max(size, max);
        }
        return max;
    }
}