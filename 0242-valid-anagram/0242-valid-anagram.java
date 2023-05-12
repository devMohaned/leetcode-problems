class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        
        for(char ch : s.toCharArray())
            arr[122   - ch] = arr[122   -ch] + 1;
        
                
        for(char ch2 : t.toCharArray())
            arr2[122   -ch2] = arr2[122   -ch2] + 1;
        
        for(int i = 0; i < 26; i++)
        {
            if(arr[i] != arr2[i])
                return false;
        }
        
        return true;
    }
}