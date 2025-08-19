class Solution {
    public int findMiddleIndex(int[] nums) {
        int prefix = 0;
        int n = nums.length;
        int total = 0;
    for(int num : nums) {
        total += num;
    }
    for(int i = 0;i<n; i++){
        total = total-nums[i];
        if(total == prefix)
            return i;
        prefix += nums[i];} 
return -1;     
}
}