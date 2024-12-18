class Solution {
    public int rob(int[] nums) {
        int prev2=0;
        int prev1=0;
        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
            ans=Math.max(nums[i]+prev2,prev1);
            prev2=prev1;
            prev1=ans;
        }
        return ans;
    }
}