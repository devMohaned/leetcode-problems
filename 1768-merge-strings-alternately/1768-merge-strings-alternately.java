class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        
        int max = Integer.max(n1,n2);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< max; i++)
        {
            if(i < n1)
            {
                char c1 = word1.charAt(i);
                sb.append(c1);
            }
            
            if(i < n2)
            {
                char c2 = word2.charAt(i);
                sb.append(c2);
            }
        }
        return sb.toString();
    }
}