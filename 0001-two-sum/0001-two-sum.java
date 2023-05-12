class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        
        for(int i = 0; i < nums.length;i++)
        {
            int current = nums[i];
            int remaining = target - current;
            
            if(map.containsKey(remaining))
                return new int[]{i, map.get(remaining)};
            
            map.put(current, i);
        }
        
        return new int[]{-1,-1};
    }
}