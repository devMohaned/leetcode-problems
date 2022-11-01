class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words)
            if(isPalindrom(word))
                return word;
        
        return "";
    }
    private boolean isPalindrom(String word){
        int leftIdx = 0;
        int rightIdx = word.length() - 1;
        while(leftIdx <= rightIdx)
        {
            if(word.charAt(leftIdx) != word.charAt(rightIdx)) return false;
            leftIdx++;
            rightIdx--;
        }
        return true;
    }
}