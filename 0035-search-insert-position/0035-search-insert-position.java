class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;int x=0;
        while(s<=e){
            int mid = s+(e-s)/2;
            x=mid;
            if(target<nums[mid]){
                e=mid-1;
            }
            else if(target>nums[mid]){
                s=mid+1;
            }
            else
            return mid;
        }
        if(nums[x]>target)
        return x;
        else
        return x+1;
    }
}