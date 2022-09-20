class Solution {
    public int fib(int value) {
        if(value == 0 || value == 1)
            return value;
        
       int[] lastTwo = new int[2];
        lastTwo[0] = 0;
        lastTwo[1] = 1;
        int count = 2;
        while(count <= value){
            int next = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = next;
            count++;
        }
        return value > 1 ? lastTwo[1] : lastTwo[0];
    }
    

}