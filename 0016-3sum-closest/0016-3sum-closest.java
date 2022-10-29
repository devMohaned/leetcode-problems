class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
               int N = nums.length;
        int minDiff=Integer.MAX_VALUE;
        int ans=0;
        
        for(int i = 0;i < N; i++)
        {
            int currentValue = nums[i];
            int left = i + 1;
            int right = N - 1;
            
            while(left < right)
            {
                int sum = currentValue + nums[left] + nums[right] ;
                if(Math.abs(target - sum) < minDiff)
                {
                    ans = sum;
                    minDiff = Math.abs(target - sum);
                }
                

                if(sum == target)return sum;
                else if(sum > target) right--;
                else left++;
                                 
                
            
            }
            
            
        }
        
        return ans;
    }
    
}