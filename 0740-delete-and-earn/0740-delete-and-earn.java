class Solution {
    public int helper(int nums[],int arr[],int idx){
        if(idx>=nums.length)
        return 0;
        if(arr[idx]!=-1)
        return arr[idx];
        int val=nums[idx];
        int sum=nums[idx];
        int nxt=idx+1;
        while(nxt<nums.length && nums[nxt]==val){
            sum+=nums[nxt];
            nxt++;
        }
        while(nxt<nums.length && nums[nxt]==val+1){
            nxt++;
        }
        int pick =sum+helper(nums,arr,nxt);
        int notpick=helper(nums,arr,idx+1);
        arr[idx]=Math.max(pick,notpick);
        return arr[idx];
    }
    public int deleteAndEarn(int[] nums) {
       Arrays.sort(nums); int n =nums.length;
       int arr[]=new int[n+1];
       Arrays.fill(arr,-1);
       return helper(nums,arr,0);
    }
}