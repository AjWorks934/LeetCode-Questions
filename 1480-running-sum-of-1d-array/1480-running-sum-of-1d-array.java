class Solution {
    public int[] runningSum(int[] nums) {
        int result[]=new int [nums.length];
        for(int i=1;i<nums.length;i++)
        {
            nums[i]+= nums[i-1];
        }
        return nums;
        
    }
}