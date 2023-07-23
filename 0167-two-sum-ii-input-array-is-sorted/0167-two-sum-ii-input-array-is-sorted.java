class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> visitedNumbers = new HashMap<>();
        
        int idx = 0;
        for(int number : numbers)
        {
            int remaining = target - number;
            if(visitedNumbers.containsKey(remaining))
                return new int[]{ visitedNumbers.get(remaining) + 1, idx + 1};
            
            visitedNumbers.put(number, idx);
            idx++;
        }
        
        return null;
    }
}