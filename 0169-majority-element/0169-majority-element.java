class Solution {
    public int majorityElement(int[] nums) {
        int c=0; int can=0;
        for(int i=0;i<nums.length;i++){
            if(c==0)
            {
                can=nums[i];
                c=1;
            }
            else if(nums[i]==can)
            c++;
            else
            c--;
        }
         c=0;
        for(int n:nums){
            if(n==can)
            c++;
            if(c>nums.length/2)
        return n;
        }
        return -1;
    }
}