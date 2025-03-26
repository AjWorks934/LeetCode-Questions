        class Solution {//here we have hald sorted parted arrays bot peak elements
    public int findMin(int[] nums) {
    int s=0;int e=nums.length-1;
        while(s<e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]==nums[s] && nums[s]==nums[e])
            {
                s++;
                e--;
            }
           // else if(nums[s]==nums[e] && (nums[mid]<nums[s]||nums[mid]<nums[e]))
            else if(nums[mid]<=nums[e])
                e=mid;
            else
                s=mid+1;//
        }   
       // System .out.println(nums[s]);
        return nums[s];
    
    }
}
    