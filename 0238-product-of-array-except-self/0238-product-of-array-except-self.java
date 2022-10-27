class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] result = new int[N];
        
        int product = 1;
        for(int i =0; i < N; i++)
        {
            result[i] = product;
            product = product * nums[i];
        }
        
        product = 1;
        for(int i = N - 1; i >= 0; i--)
        {
            result[i] *= product;
            product = product * nums[i];
        }
        
        return result;
    }
}