class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        boolean isWordFound = false;
        int lengthCount = 0;
        while (i >= 0 )
        {
            if(s.charAt(i) != ' ')
            {
                isWordFound = true;
                lengthCount++;
            }else if(isWordFound && s.charAt(i) == ' ')
            { return lengthCount;}
            i--;
        }
        return lengthCount;
            
    }
}