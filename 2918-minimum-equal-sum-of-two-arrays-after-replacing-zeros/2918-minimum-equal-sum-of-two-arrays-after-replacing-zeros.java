class Solution {
    public long minSum(int[] nums1, int[] nums2) {
      long sum1=0; long sum2=0; int z1=0,z2=0; long major=0;
      for(int i=0;i<nums1.length;i++){
        sum1+=nums1[i];
        if(nums1[i]==0)
        z1++;
      }  
      System.out.println(sum1+"s1");
      System.out.println(z1+"z1");
      for(int j=0;j<nums2.length;j++){
        sum2+=nums2[j];
        if(nums2[j]==0)
        z2++;
      }
      System.out.println(sum2+"s2");
      System.out.println(z2+"z2");

      if(sum1==sum2){
        if((z1==0 && z2>0)||(z1>0 &&z2==0)){
            return -1;
        }
        long m1=sum1+z1;
        long m2=sum2+z2;
        return m1>m2?m1:m2;
      }
      else
      {
        if(z1==0 && z2==0)
            return -1;
        else if(z1==0 && z2>0)
        {
            long m2=sum2+z2;
            if(sum1<m2)
            return -1;
        }
        else if(z2==0 && z1>0)
        {
            long m1=sum1+z1;
            if(sum2<m1)
            return -1;
        }
        
        long m1=sum1+z1;
        long m2=sum2+z2;
        return m1>m2?m1:m2;
      }
    }
}