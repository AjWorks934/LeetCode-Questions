class Solution {
    public long minSum(int[] nums1, int[] nums2) {
      long sum1=0; long sum2=0; int z1=0,z2=0; long major=0;
      for(int i=0;i<nums1.length;i++){
        sum1+=nums1[i];
        if(nums1[i]==0){
        z1++;
        sum1++;
      }  
      }
      for(int j=0;j<nums2.length;j++){
        sum2+=nums2[j];
        if(nums2[j]==0){
        z2++;
        sum2++;
        }
      }
    if((sum1>sum2 && z2==0)|| (sum2>sum1 && z1==0))
    return -1;
    return Math.max(sum1,sum2);
    }
}