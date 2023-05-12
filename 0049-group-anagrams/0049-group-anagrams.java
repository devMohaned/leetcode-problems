class Solution {
    // Space Complexity: O(N + M) where N is the size of anagramSignatures and M is the size of groups
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        Map<String, List<String>> map = new HashMap();
        
        // Time Complexity: O(N * M) Where N is the size of array of strings & M is the largest length of Strings found
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