class Solution {
 int[] memo;
public int rob(int[] nums) {
    memo = new int[nums.length + 1];
    Arrays.fill(memo, -1);
    return robhelper(nums, nums.length - 1);
}
public int robhelper(int[] nums, int i) {
    if (i < 0) {
        return 0;
    }
    if (memo[i] >= 0) {
        return memo[i];
    }
    int result = Math.max(robhelper(nums, i - 2) + nums[i], robhelper(nums, i - 1));
    memo[i] = result;
    return result;
}
}