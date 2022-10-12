class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x < 10)
            return true;
        
        
    /*    String numberInString = String.valueOf(x);
        String palindrom = "";
        for(int i = numberInString.length() - 1 ; i >= 0; i--)
        {
            char c = numberInString.charAt(i);
            palindrom += c;
        }
        
        return palindrom.equals(numberInString);
            */
        
        int palindrom = 0;
        int temp = x;
        while(temp > 0)
        {
            int lastDigit = temp % 10;
            palindrom = palindrom*10 + lastDigit;
            temp = temp / 10;
        }
        
        return palindrom == x;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      /*  if(x < 0)
            return false;
        else if(x < 10)
            return true;
        */
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
        
      /*  int temp = x;
        int reverse = 0;
        while(temp > 0)
        {
            int lastDigit = temp % 10; // 1
            reverse = (reverse*10) + lastDigit; // 32*10 + 1
            temp = temp / 10; // 0
        }
        
        if(x == reverse)
            return true;
        else
            return false;
        
        */
        
    }
}