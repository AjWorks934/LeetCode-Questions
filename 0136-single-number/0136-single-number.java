class Solution {
    public int singleNumber(int[] nums) {
        int diff=0;//0 xor any no. is the no.
        for(int i=0;i<nums.length;i++){
            diff=diff^nums[i];
        }
        return diff;
    }
}