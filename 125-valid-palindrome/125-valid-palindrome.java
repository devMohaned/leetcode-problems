class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return false;
        if(s.length() == 1) return true;
        String withoutSpaces = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int N = withoutSpaces.length();
      
        
        int left = 0;
        int right = N - 1;
        while(left <= right)
        {
            if(withoutSpaces.charAt(left) != withoutSpaces.charAt(right)) return false;
            
            left++;
            right--;
        }
        return true;
    }
}