class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int n=nums.length;
        int dp[]=new int [n];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            int select=nums[i]+dp[i-2];
            int skip=dp[i-1];
            dp[i]=Math.max(select,skip);
        }
        return dp[n-1];
    }
}