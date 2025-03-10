class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMin = 0,currMax=0, min = Integer.MAX_VALUE;
        int n=nums.length,max = Integer.MIN_VALUE;int Tmax=0;
        for(int i=0;i<nums.length;i++)
            Tmax+=nums[i];
        System.out.println(Tmax);
        for(int i=0;i<nums.length;i++){
                currMin=Math.min(nums[i]+currMin,nums[i]);
                min=Math.min(min,currMin);
            }
        System.out.println(min);
        for(int i=0;i<nums.length;i++){
                currMax=Math.max(nums[i]+currMax,nums[i]);
                max=Math.max(max,currMax);
            }
        System.out.println(max);
       // if(Tmax<0 && min<Tmax)
       // max=Math.max(max,min-Tmax);
       // System.out.println(max);
        if(max>=0)
        max=Math.max(max,Tmax-min);
        return max;
    }
}