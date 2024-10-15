class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String left = "";
        String right = "";
        for(String word : word1)
        {
            left += word;
        }
        
          for(String word : word2)
        {
            right += word;
        }
        return left.equals(right);
        
        
    }
}