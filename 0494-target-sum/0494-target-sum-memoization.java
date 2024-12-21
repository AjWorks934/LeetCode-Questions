class Solution {
        public int helper(int[] nums,int idx, int target,int currsum,int arr[][],int tsum) {
            if(idx==nums.length)
            { if(target==currsum)
                return 1;
            else
            return 0;
            }
            if(arr[idx][currsum+tsum]!=-1)
            return arr[idx][currsum+tsum];
            int add=helper(nums,idx+1,target,currsum+nums[idx],arr,tsum);
            int subs=helper(nums,idx+1,target,currsum-nums[idx],arr,tsum);
            arr[idx][currsum+tsum]=add+subs;
            return arr[idx][currsum+tsum];
        }   
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int arr[][]=new int[nums.length+1][2*sum+1];
        for(int row[]: arr)
        Arrays.fill(row,-1);
        return helper(nums,0,target,0,arr,sum);
    }
}