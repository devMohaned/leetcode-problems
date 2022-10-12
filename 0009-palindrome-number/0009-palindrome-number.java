class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x < 10)
            return true;
            
        
        int palindrom = 0;
        int temp = x;
        while(temp > 0)
        {
            int lastDigit = temp % 10;
                       temp = temp / 10;
 palindrom = palindrom*10 + lastDigit;
        }
        
        return palindrom == x;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}