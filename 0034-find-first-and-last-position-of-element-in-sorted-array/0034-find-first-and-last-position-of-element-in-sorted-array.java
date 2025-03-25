class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        int l=-1;int s=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=target){
            continue;
            }
            else{
                s=i;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target)
                l=j;
            }
            break;
            }
        }
        arr[0]=s;arr[1]=l;
        return arr;
    }
}