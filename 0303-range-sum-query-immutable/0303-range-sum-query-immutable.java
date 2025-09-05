class NumArray {

    private int[] sums;
    public NumArray(int[] nums) {
        int N = nums.length;
        sums = new int[nums.length];
        int index = 0;
        for(int number : nums) sums[index++] += number;
        
    }
    
    public int sumRange(int left, int right) {
        int total = 0;
        while(left <= right)
        {
            total += sums[left++];
        }
        return total;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */