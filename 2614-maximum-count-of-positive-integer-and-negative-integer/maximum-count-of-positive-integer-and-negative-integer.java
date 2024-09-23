class Solution {
    public int maximumCount(int[] nums) {
        int cpos = 0;
        int cneg = 0;
        for (int num : nums) {
            if (num > 0) {
                cpos++;
            } else if (num < 0) {
                cneg++;
            }
        }
        return Math.max(cpos, cneg);
    }
}
