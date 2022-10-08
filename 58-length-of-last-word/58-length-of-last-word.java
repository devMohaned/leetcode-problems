class Solution {
    public int lengthOfLastWord(String s) {
      int end = s.length() - 1;
        int count = 0;
        boolean isFoundLastWord = false;
        while(end >= 0)
        {
            if(s.charAt(end) != ' ')
            {
                isFoundLastWord = true;
                count++;
            }else if(isFoundLastWord && s.charAt(end) == ' ')
            {
                return count;
            }
            end--;
        }
        return count;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      /*  int i = s.length() - 1;
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
        */
        
     /*  
       int i = s.length() - 1;
        boolean isWordFound = false;
     while (i >= 0 )
        {
            if(s.charAt(i) != ' ')
            {
                isWordFound = true;
                int j = i;
                int lengthCount = 0;
                while(j >= 0 && j <= i)
                {
                    lengthCount++;
                    if(s.charAt(j) == ' ' ) return (i - j);
                    j--;
                }
                return lengthCount;
                
            }
            i--;
        }
        
        return -1;*/
            
    }
}