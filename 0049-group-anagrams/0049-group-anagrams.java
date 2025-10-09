class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            int[] chars = new int[26];
            for(char c : s.toCharArray())
            {
                chars[c - 'a']++;
            }
            String key = Arrays.toString(chars);
            List<String> existingValues = map.getOrDefault(key,new ArrayList<>());
            existingValues.add(s);
            map.put(key, existingValues);
        }
        return new ArrayList<>(map.values());
    }
}