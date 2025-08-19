class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        int l=0;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(totalsum-2*l-nums[i]);
            l+=nums[i];
        }
        return ans;
    }
}