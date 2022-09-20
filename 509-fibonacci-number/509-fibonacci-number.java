class Solution {
    public int fib(int value) {
        if(value == 0 ||value == 1)
            return value;
        if(value == 2)
        return 1;
                        
        return fib(value - 1) + fib(value - 2);
    }
    

}