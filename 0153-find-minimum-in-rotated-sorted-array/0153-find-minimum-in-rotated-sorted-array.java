class Solution {//brute force approach O(n)
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }
        return min;
    
    }
}