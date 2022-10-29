class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int N = nums.length;
        int smallestDifference = Integer.MAX_VALUE;
        int answer = 0;
        
 for(int i = 0;i < N; i++)
        {
            int currentValue = nums[i];
            int left = i + 1;
            int right = N - 1;

            while(left < right)
            {
                int sum = currentValue + nums[left] + nums[right] ;
                if(Math.abs(target - sum) < smallestDifference)
                {
                    answer = sum;
                    smallestDifference = Math.abs(target - sum);
                }
                

                if(sum == target)return sum;
                else if(sum > target) right--;
                else left++;
                                 
                
            
            }
            
            
        }
        
        return answer;
    }
    
}