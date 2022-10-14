class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = nums1.clone();
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
    }
}