class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int num: nums)
        {
            if(Math.abs(num) < min)
            {min = Math.abs(num);
                ans = num;
        }else if (Math.abs(num) == min && num > ans) {
        ans = num;
      }
        }
         return ans;
    }

}