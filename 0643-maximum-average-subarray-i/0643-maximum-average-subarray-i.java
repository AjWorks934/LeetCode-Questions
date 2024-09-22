class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
             sum+=nums[i];
             
        }
        int x=sum;
        for(int i=0;i<nums.length-k;i++){
            int s2=x-nums[i]+nums[i+k];
            if(s2>sum){
            sum=s2;
            x=sum;
            }
            else
            x=s2;
        }
        return (double)sum/k;
    }
}
