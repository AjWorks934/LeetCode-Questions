class Solution {//here we have hald sorted parted arrays bot peak elements
    public int findMin(int[] nums) {
    int s=0;int e=nums.length-1;
        if (nums[s]<=nums[e])
        {
            return nums[s];
        }
        while(s<e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]>=nums[0])
                s=mid+1;
            else
                e=mid;//
        }   
        System .out.println(nums[s]);
        return nums[s];
    
    }
}