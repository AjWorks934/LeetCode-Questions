class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int w=0;int l=0;int ans=0;
        for(int r=0;r<nums.length;r++){
            w+=nums[r];
            while(w>=target){
                if(ans==0)
                ans=r-l+1;
                ans=Math.min(ans,r-l+1);
                w-=nums[l];
                l++;
            }
        }
        return ans;
    }
}