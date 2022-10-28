class Solution {
    public String longestPalindrome(String s) {
        int[] currentLongestIdx = new int[2];
        int[] odd = new int[2];
        int[] even = new int[2];
        
        for(int i = 0; i < s.length();i++)
        {
            odd = getLongestPalindromeIdx(s,i-1, i+1);
            even = getLongestPalindromeIdx(s, i-1 ,i);
            if(odd[1] - odd[0] > even[1] - even[0])
               currentLongestIdx = updateLongestOrKeep(currentLongestIdx, odd);
            else
                currentLongestIdx = updateLongestOrKeep(currentLongestIdx, even);
        }
        
        
        return s.substring(currentLongestIdx[0],currentLongestIdx[1]);
    }
    
    private int[] getLongestPalindromeIdx(String s, int leftIdx, int rightIdx)
    {
            while(leftIdx >= 0 && rightIdx < s.length())
            {
                
                if(s.charAt(leftIdx) != s.charAt(rightIdx))break;
                
                leftIdx--;
                rightIdx++;
            }
            return new int[]{leftIdx + 1, rightIdx};
    }
    
    private int[] updateLongestOrKeep(int[] arr, int[] oddOrEven){
        if(arr[1] - arr[0] < oddOrEven[1] - oddOrEven[0])
            return oddOrEven;
        return arr;
    }
}