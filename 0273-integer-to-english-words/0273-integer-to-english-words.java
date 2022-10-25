class Solution {
    HashMap<Integer, String> map = new HashMap<Integer, String>();

    public String numberToWords(int num) {
        fillConstants();
        if(num == 0)
        return "Zero";
        StringBuilder sb = new StringBuilder();
    
        int BILLION_DIVIDER = 1000000000;
        int MILLION_DIVIDER = 1000000;
        int THOUSAND_DIVIDER = 1000;
        
        int billion3Digits = num / BILLION_DIVIDER;
        num -= billion3Digits * BILLION_DIVIDER;

        int million3Digits = num / MILLION_DIVIDER;
        num -= million3Digits * MILLION_DIVIDER;

        int thousand3Digits = num / THOUSAND_DIVIDER;
        num -= thousand3Digits * THOUSAND_DIVIDER;

        if(billion3Digits > 0)
        sb.append(findThreeDigits(billion3Digits) + " Billion ");
        
        if(million3Digits > 0)
        sb.append(findThreeDigits(million3Digits) + " Million ");
        
        if(thousand3Digits > 0)
        sb.append(findThreeDigits(thousand3Digits) + " Thousand ");
        
        
        if(num > 0)
        sb.append(findThreeDigits(num));
        return sb.toString().strip();
    }
    
    private String findThreeDigits(int number){
        // 123  ***
        if(number >= 100 && number < 1000)
        {
            int firstDigit = number / 100;
            int last2Digits = number % 100;
            
            String firstSection = map.get(firstDigit);
            String secondSection = findTwoDigitsString(last2Digits);
            if(last2Digits == 0)return firstSection + " Hundred";
            
            return firstSection + " Hundred " + secondSection;
  }else if(number < 100) return findTwoDigitsString(number); // 23  **
        
        return "Couldn't Achieve Find Three Digit Function";
        
    }
    
    private String findTwoDigitsString(int number)
    {
        if(number > 0 && number <= 20)return map.get(number);
        
        if(number % 10 == 0)   // 40
        return map.get(number);
    
        return map.get((number/10) * 10) + " " + map.get(number%10);
            
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void fillConstants(){
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");
        map.put(6,"Six");
        map.put(7,"Seven");
        map.put(8,"Eight");
        map.put(9,"Nine");
        map.put(10,"Ten");
        map.put(11,"Eleven");
        map.put(12,"Twelve");
        map.put(13,"Thirteen");
        map.put(14,"Fourteen");
        map.put(15,"Fifteen");
        map.put(16,"Sixteen");
        map.put(17,"Seventeen");
        map.put(18,"Eighteen");
        map.put(19,"Nineteen");
        map.put(20,"Twenty");
        map.put(30,"Thirty");
        map.put(40,"Forty");
        map.put(50,"Fifty");
        map.put(60,"Sixty");
        map.put(70,"Seventy");
        map.put(80,"Eighty");
        map.put(90,"Ninety");
    }
    
    
    
}