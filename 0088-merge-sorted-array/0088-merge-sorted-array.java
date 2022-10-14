class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = nums1.clone();
        int leftIdx = 0;
        int rightIdx = 0;
        int toBeAddedIdx = 0;
        while(leftIdx < m && rightIdx < n)
        {
            if(temp[leftIdx] < nums2[rightIdx])
                nums1[toBeAddedIdx++] = temp[leftIdx++];
            else  
                nums1[toBeAddedIdx++] = nums2[rightIdx++];
            
        }
        // add remaining elements
        if(leftIdx < m)
        {
            for(int i = leftIdx; i < m; i++)
            {
                nums1[toBeAddedIdx++] = temp[leftIdx++];
            }
        }
        
         if(rightIdx < n)
        {
            for(int i = rightIdx; i < n; i++)
            {
                nums1[toBeAddedIdx++] = nums2[rightIdx++];
            }
        }
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      /*  int[] temp = nums1.clone();
        int firstIdx = 0;
        int secondIdx = 0;
        int insertedIdx = 0;
        while(firstIdx < m && secondIdx < n)
        {
            if(temp[firstIdx] < nums2[secondIdx])
            {
                nums1[insertedIdx++] = temp[firstIdx];
                firstIdx++;
            }else{
                nums1[insertedIdx++] = nums2[secondIdx];
                secondIdx++;
            }
        }
        
        // Check for the remaining idx
        if(firstIdx < m)
        {
            for(int i = firstIdx; i < m; i++)
            {
                int remaining = temp[i];
                nums1[insertedIdx++] = remaining;
            }
        }
          if(secondIdx < n)
        {
            for(int i = secondIdx; i < n; i++)
            {
                int remaining = nums2[i];
                nums1[insertedIdx++] = remaining;
            }
        }
    }*/
}