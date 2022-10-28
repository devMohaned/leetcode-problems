class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x < 0)
        {
        isNegative = true;
        x *= -1;
        }
        
        
        int reversed = 0;
        while(x > 0) 
        {
        int remainder = x % 10; 
        long test = (long)reversed * 10 + remainder;;
        if (test > Integer.MAX_VALUE || test < Integer.MIN_VALUE)
            return 0;
            reversed = reversed * 10 + remainder;
            x = x/10; 
        }
        
        
        // 123
        // Get Remainder 123 % 10 = 3
        // Reverse = 0*10 + 3
        
        // 12
        // Remainder 12 % 10 = 2
        // Reverse = 3*10 + 2 = 32
        
        // 1
        // Remainder 1 % 10 = 1
        // Reverse = 32 * 10 + 1 = 321
        
        // ======================
        
        // Negative (* -1)
        
        return isNegative ? reversed * -1 : reversed;
    }
}