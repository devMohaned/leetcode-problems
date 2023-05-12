class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        Map<String, List<String>> map = new HashMap();
        
        for(String s : strs)
        {
            int[] anagram = new int[26];
            for(char c : s.toCharArray())
                anagram[122 - c]++;
            
            String anagramStr = Arrays.toString(anagram);
            map.putIfAbsent(anagramStr, new ArrayList());
            map.get(anagramStr).add(s);
        }
        
        result.addAll(map.values());
        return result;
    }
}