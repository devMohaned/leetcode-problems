class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap 
            = new PriorityQueue<>((p1,p2) ->  getDistance(p2) - getDistance(p1));
        
            for(int[] point : points)
            {
                maxHeap.add(point);
                if(maxHeap.size() > k) maxHeap.poll();
            }
                
                
        int i =0;
        int[][] result = new int[k][2];
        while(!maxHeap.isEmpty()) result[i++] = maxHeap.poll();
        
        return result;
    }
    
    private int getDistance(int[] p){
        int x = p[0];
        int y = p[1];
        return x*x + y*y;
        
    }
}