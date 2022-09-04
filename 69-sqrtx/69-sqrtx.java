class Solution {
    public int mySqrt(int x) {
        long result = 1;
        while(result*result <= x)
        {
            result++;
        }
        
        return (int) result - 1;
    }
    
}