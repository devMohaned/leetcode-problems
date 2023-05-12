class Solution {
    public boolean isAnagram(String s, String t) {
      int[] arr = new int[26];
        int[] arr2 = new int[26];
        
        
        for(char char1 : s.toCharArray())
            arr[122 - char1] = arr[122 - char1] + 1;
        
          for(char char2 : t.toCharArray())
            arr2[122 - char2] = arr2[122 - char2] + 1;
        
        for(int i =0; i < 26; i++) 
            if(arr[i] != arr2[i]) return false;
        
        
        return true;
        
        
    }
}