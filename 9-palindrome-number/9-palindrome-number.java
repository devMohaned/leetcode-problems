class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        else if(x < 10)
            return true;
        
      /*  String value = String.valueOf(x);
        String palindrome = "";
        for(int i = value.length() - 1; i >= 0; i--)
        {
            char c = value.charAt(i);
            palindrome += c;
        }
        if(palindrome.equals(value))
            return true;
        
        return false;*/
        
        int temp = x;
        int reverse = 0;
        // x % 10 = final digit 
        // 123 (123 % 10) --> 3
        while(temp > 0)
        {
            int lastDigit = temp % 10; // 2
            reverse = (reverse*10) + lastDigit; // 0*10 + 3
            temp = temp / 10; // 12
        }
        
        if(x == reverse)
            return true;
        else
            return false;
        
        
        
    }
}