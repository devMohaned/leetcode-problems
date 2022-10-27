class Solution {
  private final String[] belowTen = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    
    private final String[] belowTwenty = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    
    private final String[] belowHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        
    int BILLION = 1000000000;
    int MILLION = 1000000;
    int THOUSAND = 1000;
    int HUNDRED = 100;
    
 public String numberToWords(int num) {
        if (num == 0) return "Zero";
        return helper(num); 
        
      
    }
    
   
     private String helper(int num) {
        StringBuilder result = new StringBuilder();
        if (num < 10) 
            result.append(belowTen[num]);
        else if (num < 20) 
            result.append(belowTwenty[num -10]);
        else if (num < HUNDRED) 
            result
            .append(belowHundred[num/10])
            .append(" ")
            .append(helper(num % 10));
        else if (num < THOUSAND) 
            result
            .append(helper(num/HUNDRED))
            .append(" Hundred ")
            .append(helper(num % HUNDRED));
        else if (num < MILLION) 
            result
            .append(helper(num/THOUSAND))
            .append(" Thousand ")
            .append(helper(num % THOUSAND));
        else if (num < BILLION)
            result
            .append(helper(num/MILLION))
            .append(" Million ")
            .append(helper(num % MILLION));
        else result
            .append(helper(num/BILLION))
            .append(" Billion ")
            .append(helper(num % BILLION));
         
        return result.toString().trim();
    }
    
    
}