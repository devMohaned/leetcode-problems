class Solution {
    public int scoreOfString(String s) {
        int cumlative = 0;
        for(int i =0; i < s.length() - 1;i++)
        {
            int c1 = ((int) s.charAt(i));
            int c2 = ((int) s.charAt(i+1));
            cumlative += Math.abs(c1 - c2);
        }
        return cumlative;
    }
    
}