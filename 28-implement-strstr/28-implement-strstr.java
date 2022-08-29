class Solution {
    public int strStr(String haystack, String needle) {
        int size = needle.length();
        int fullSize = haystack.length();
            if(size > fullSize)
            return -1;
     
        
            int i = 0;  // 2 < 5 - 0 he  
                        // 2 < 5 - 1 el
                        // 2 < 5 - 2 ll
                        // 2 < 5 - 3 lo
        while(size <= fullSize - i){
            String subset = haystack.substring(i,i + size);
           //     System.out.println("Subset: " + subset);
                if(subset.equals(needle))
                    return i;
                i++;
        }
        return -1;
                
    }
}