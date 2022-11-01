

class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> heap = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
        for(int num : nums){
           heap.add(num);
       }
        
        int i = 1;
        while(i < k)
        {
            heap.poll();
            i++;
        }
        
        return heap.peek();
    }
}