class Solution {
    public int[] plusOne(int[] digits) {
         if (digits == null || digits.length == 0) return new int[] {1};

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
            if (i == 0) {
                int[] ret = new int[digits.length + 1];
                ret[0] = 1;
                return ret;
            }
        }

        return digits;
    }
}