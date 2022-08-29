class Solution {
    public int romanToInt(String s) {
        if(s.equals("IV"))
            return 4;
        else if(s.equals("IX"))
            return 9;
        else if(s.equals("XL"))
            return 40;
         else if(s.equals("XC"))
            return 90;
         else if(s.equals("CD"))
            return 400;
         else if(s.equals("CM"))
            return 900;
        
        Map<String, Integer> roman = new HashMap<String, Integer>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        roman.put("IV", 4);
        roman.put("IX", 9);
        roman.put("XL", 40);
        roman.put("XC", 90);
        roman.put("CD", 400);
        roman.put("CM", 900);
        
        int N = s.length();
                    System.out.println("N = " + N);

        int result = 0;
        for(int i = 0; i < N;i++)
        {
            String subset = "";
            if(i + 2 <=  N) 
            subset = s.substring(i, i + 2);
            
            System.out.println("i + 2 = " + (i + 2));
            
                
            if(roman.containsKey(subset) && !subset.equals(""))
            {
                result += roman.get(subset);
                i++;
            }else{
                subset = s.substring(i, i + 1);
                result += roman.get(subset);
                }
        }
        
        
        return result;
        
    }
}