class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer,  Integer> countMap = new HashMap();
        for(int number : nums)
            countMap.put(number, countMap.getOrDefault(number,0) + 1);
        
        List<Integer>[] countsArray = new ArrayList[nums.length + 1];
        for(int key : countMap.keySet())
        {
            int count = countMap.get(key);
            if(countsArray[count] == null) countsArray[count] = new ArrayList();
            countsArray[count].add(key);
        }
        
        int[] result = new int[k];
        int index = 0;
        for(int i = nums.length; i >= 0; i--)
        {
            List<Integer> returnedArray = countsArray[i];
            if(returnedArray == null)
                continue;
            
            for(int numb : returnedArray)
            {
                result[index++] = numb;
                if(k == index) return result;
            }
            
        }
        
        return result;
        
    }
    
}