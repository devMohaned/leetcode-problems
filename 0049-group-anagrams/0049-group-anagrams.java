class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        int N = strs.length;
        Map<String, List<String>> map = new HashMap();
      
        for(String s : strs)
        {
            int[] letterCountsArr = new int[26];
            for(char c : s.toCharArray())
            letterCountsArr[122 - c]++;
            
            String key = Arrays.toString(letterCountsArr);
            map.putIfAbsent(key, new ArrayList());
            map.get(key).add(s);
            letterCountsArr = null;
        }
        result.addAll(map.values());
        return result;
    }
}