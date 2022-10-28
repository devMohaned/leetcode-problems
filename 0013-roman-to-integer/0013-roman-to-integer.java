class Solution {
    public int romanToInt(String s) {
        // Answer Result / Current Number / Previous Number
    int answer = 0, number = 0, prev = 0;

        // Solving Backward
    for (int j = s.length() - 1; j >= 0; j--) {
        switch (s.charAt(j)) {
            case 'M': number = 1000; break;
            case 'D': number = 500; break;
            case 'C': number = 100; break;
            case 'L': number = 50; break;
            case 'X': number = 10; break;
            case 'V': number = 5; break;
            case 'I': number = 1; break;
        }

           // If the current number is smaller than the previous, thus, we decrement the answer by the current number
 if (number < prev) {
            answer -= number; 
        }
        else { 
    // If the current number is greater or equal, thus, we increment the answer by the current number
            
            answer += number;
        }
        
        prev = number;
    }
    return answer;
        
    }
}