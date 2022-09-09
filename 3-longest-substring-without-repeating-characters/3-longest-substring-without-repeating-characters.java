class Solution {
    public int lengthOfLongestSubstring(String s) {
        int N = s.length();
        if(N == 0)
            return 0;
        
        HashMap<Character, Boolean> isVisitedMap = new HashMap();
        
        int i = 0, j = 0;
        int max = 0;
        
        while(i < N && j < N)
        {
            Character leftChar = s.charAt(i);
            Character rightChar = s.charAt(j);
            if(!isVisitedMap.containsKey(rightChar))
            {
                isVisitedMap.put(rightChar, true);
                j++;
                max = Math.max(max, j - i);
            }else{
                isVisitedMap.remove(leftChar);
                i++;
            }
        }
        return max;
        
        
    }
}