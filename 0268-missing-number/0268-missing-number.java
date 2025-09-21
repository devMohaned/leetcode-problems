class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedTotal = n * (n + 1) / 2;
        int total = 0;
        for(int number : nums)
        {
            total += number;
        }

        return expectedTotal - total;
    }
}