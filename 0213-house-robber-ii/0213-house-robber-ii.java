class Solution {
    public int rob(int[] nums) {
        int arr[] = new int[nums.length + 1];
        if(nums.length==1)
        return nums[0];
        Arrays.fill(arr, -1);
        int n=nums.length;
        int x=rob1(nums, 0,n-1, arr);
        Arrays.fill(arr, -1);
        int y=rob1(nums, 1,n, arr);
        return Math.max(x,y);
    }

    public int rob1(int[] nums,int i,int n,int arr[]) {
        if(i>=n){
            return 0; 
        }
        if(arr[i]==-1){
            int select=nums[i]+rob1(nums,i+2,n,arr);
            int skip=rob1(nums,i+1,n,arr);
             arr[i]= Math.max(select,skip);
             return arr[i];
            }
            return arr[i];
        }
}