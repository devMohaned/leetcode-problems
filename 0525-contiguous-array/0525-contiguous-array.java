class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> first = new HashMap<>();
        first.put(0, -1);             // balance 0 occurs "before" the array
        int balance = 0, best = 0;

        for (int i = 0; i < nums.length; i++) {
            int addOrRemove = (nums[i] == 1) ? 1 : -1;
            balance += addOrRemove;

            if (first.containsKey(balance)) {
                best = Math.max(best, i - first.get(balance));
            } else {
                first.put(balance, i); // store earliest index only
            }
        }
        return best;
    }
}