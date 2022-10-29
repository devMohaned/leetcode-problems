class Solution {
    public int climbStairs(int n) {
      /*  if(n <= 3)
            return n;
      
        
        int a = 3;
        int b = 2;
        for(int i = 0; i < n - 3; i++)
        {
        a = a + b;
        b = a - b;
        }
        return a;*/
        
        int prev = 0;
        int current = 1;
        int temp = 0;
        
        for(int i =0; i < n; i++)
        {
            temp = current;
            current = current + prev;
            prev = temp;
        }
        return current;
    }
}