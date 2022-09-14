class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int value: nums)
        {
            if(Math.abs(value) < min)
            {min = Math.abs(value);
                ans = value;
        }else if (Math.abs(value) == min && value > ans) {
        ans = value;
      }
        }
         return ans;
    }

}