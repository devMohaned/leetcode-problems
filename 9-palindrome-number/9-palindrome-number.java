class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        else if(x < 10)
            return true;
        // 20005   50002  (20005 / (10^(5 length - 1)) = 2.0005 (int 2))
        // 20005   50002  (20005 / 10^(5-2)) = 20
        String value = String.valueOf(x);
        String palindrome = "";
        for(int i = value.length() - 1; i >= 0; i--)
        {
            char c = value.charAt(i);
            palindrome += c;
        }
        if(palindrome.equals(value))
            return true;
        
        return false;
    }
}