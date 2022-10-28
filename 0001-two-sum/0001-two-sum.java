class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i =0; i < nums.length;i++)
        {
            int value = nums[i];
            int prevIdx = map.getOrDefault(target - value, -1);
            if(prevIdx != -1)
                return new int[]{prevIdx,i};
            else
                map.put(value, i);
        }
        return new int[]{-1,-1};
    }
}