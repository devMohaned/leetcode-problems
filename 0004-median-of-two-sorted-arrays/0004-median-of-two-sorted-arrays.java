class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /*
        Median Of ODD = SIZE + 1 / 2  => ITS INDEX -1
        Median OF EVEN = SIZE /2 => ITS INDICES [-1, N/A]
        */
       
        int M = nums1.length;
        int N = nums2.length;
        int T = M+N;
  int leftIdx = 0;
        int rightIdx = 0;
        int highest = Math.max(M,N);
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
        if(T % 2 == 0)   return (merged[((T/2) - 1)] + merged[T/2])/2;
        else return merged[((T+1)/2) - 1];
        
              
    }
}