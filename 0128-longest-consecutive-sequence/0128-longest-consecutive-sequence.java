class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1)
            return 0;
        
        
        Set set = new HashSet();
        int result = 1;
        
        for(int num : nums)
            set.add(num);
        
        for(int num : nums)
        {
            
            if(!set.contains(num + 1))
            {
                int answer = 1;
                while(set.contains(num - 1))
                {
                    answer++;
                    num--;
                }
                result = Math.max(answer, result);
            }
        }
        
        return result;
    }
}