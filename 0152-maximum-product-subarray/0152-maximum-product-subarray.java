class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;int pref=1;int suff=1; int max=Integer.MIN_VALUE;
        int pmx=Integer.MIN_VALUE;int smx=Integer.MIN_VALUE; 
        for(int i=0;i<n;i++){
        if(pref==0)
            pref=1;
        if(suff==0)
            suff=1;
        pref*=nums[i];
        suff*=nums[n-1-i];
        
        pmx=Math.max(pref,pmx);
        smx=Math.max(suff,smx);
        max=Math.max(max,Math.max(pmx,smx));
        }
        return max;
    }
}