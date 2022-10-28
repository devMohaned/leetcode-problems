class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /*
        Median Of ODD = SIZE + 1 / 2  => ITS INDEX -1
        Median OF EVEN = SIZE /2 => ITS INDICES [-1, N/A]
        */
       
        int M = nums1.length;
        int N = nums2.length;
        if(M == 0)
        return findMedian(nums2,N);
        if(N == 0)
        return findMedian(nums1,M);

        int T = M+N;
        int leftIdx = 0;
        int rightIdx = 0;
        double[] merged = new double[M+N];
        int i =0;
        while(leftIdx < M || rightIdx < N)
        {
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
            if(leftIdx < M){
               left = nums1[leftIdx];
           }
            
              if(rightIdx < N){
               right = nums2[rightIdx];
           }
            
            if(left > right)
            {
                merged[i] = right;       
                rightIdx++;
            }else {   
                merged[i] = left;   
                leftIdx++;
            }
                i++;
}
       return findMedian(merged, T);
        
              
    }
    
    private double findMedian(double[] merged, int T){
        return T % 2 == 0 ?(merged[((T/2) - 1)] + merged[T/2])/2 
            : merged[((T+1)/2) - 1];
    }
      private double findMedian(int[] merged, int T){
        return T % 2 == 0 ?((double)(merged[((T/2) - 1)] + merged[T/2])/2) 
            : ((double)merged[((T+1)/2) - 1]);
    }
}