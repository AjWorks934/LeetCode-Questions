class Solution {
        public int helper(int[] nums,int idx, int target,int currsum) {
            if(idx==nums.length)
            { if(target==currsum)
                return 1;
            else
            return 0;
            }
            int add=helper(nums,idx+1,target,currsum+nums[idx]);
            int subs=helper(nums,idx+1,target,currsum-nums[idx]);
            return add+subs;
        }   
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,0,target,0);
    }
}