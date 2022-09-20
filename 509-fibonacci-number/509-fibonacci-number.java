class Solution {
    public int fib(int n) {
        int result = helper(n);
        return result;
    }
    
    private int helper(int value)
    {
 if(value == 0 ||value == 1)
            return value;
        if(value == 2)
        return 1;
                        
        return helper(value - 1) + helper(value - 2);
        
    }
}