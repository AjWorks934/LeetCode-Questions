import java.util.Arrays;
class Solution {
    public int maxSubArray(int[] nums) {
        int curMax = 0, maxTillNow = Integer.MIN_VALUE;
        for (int c : nums) {
            curMax = Math.max(c, curMax + c);
            maxTillNow = Math.max(maxTillNow, curMax);
        }
        return maxTillNow;
    }
}

