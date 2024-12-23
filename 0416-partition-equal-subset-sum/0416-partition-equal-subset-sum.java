class Solution {
    public boolean helper(int[] nums,int target,int arr[][],int idx) {
    if(idx>=nums.length||target<0)
    return false;
    if(target==0)
    return true;
    boolean pick=false;
    if(arr[idx][target]!=-1){
        if(arr[idx][target]==1)
        return true;
        else
        return false;
    }
    boolean notpick=helper(nums,target,arr,idx+1);
    if(nums[idx]<=target)
    pick=helper(nums,target-nums[idx],arr,idx+1);
    if(pick||notpick){
            arr[idx][target]=1;
            return true;
        }
        else{
            arr[idx][target]=0;
            return false;
        }
    }
    public boolean canPartition(int[] nums) {
        int sum=0;int target=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if((sum&1)==1)
        return false;
        target=sum/2;
        int arr[][]=new int[nums.length+1][target+1];
        for(int rows[]:arr)
        Arrays.fill(rows,-1);
        return helper(nums,target,arr,0);
    }
}