class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
    
        int N = nums.length;
        int target = 0;
        for(int i = 0;i < N; i++)
        {
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            
            int currentValue = nums[i];
            int left = i + 1;
            int right = N - 1;
            
            while(left < right)
            {
                int greaterOrLessOrEqual = currentValue + nums[left] + nums[right];
                if(greaterOrLessOrEqual == target)
                {
                    List<Integer> found = new ArrayList<Integer>();
                    found.add(currentValue);
                    found.add(nums[left]);
                    found.add(nums[right]);

                    result.add(found);
                    left++;
                    right--;
    // Never let left refer to the same value twice (in an output) to avoid duplicates
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }else if(greaterOrLessOrEqual < target)
                {
                    left++;
                }else{
                    right--;
                }
            }
            
            
        }
        
        return result;
    }
}