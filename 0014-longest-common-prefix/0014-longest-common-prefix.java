class Solution {
    public String longestCommonPrefix(String[] strs) {
   if (strs == null || strs.length == 0) return "";
        
        StringBuilder longest = new StringBuilder();
        int minimumLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) 
            minimumLength = Math.min(minimumLength, strs[i].length());
        

        for (int i = 0; i < minimumLength; i++) {
            char current = strs[0].charAt(i);
            // Check if this character is found in all other strings or not
            for (String str : strs) {
                if (str.charAt(i) != current) {
                    return longest.toString();
                }
            }
            longest.append(current);
        }
        return longest.toString();
    }
}