class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap();
        
        for(int num : arr)
            map.put(num, map.getOrDefault(num,0) + 1);
        
        HashSet<Integer> uniqueValues = new HashSet();
        for(int value : map.values())
                    uniqueValues.add(value);
        
        return map.size() == uniqueValues.size();
            
        
    }
}