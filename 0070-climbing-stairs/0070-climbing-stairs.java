class Solution {
    public int climbStairs(int n) {
       if(n==1 || n==0)
       return 1;
       if(n==2)
       return 2;
       int ow=1;int aw=2;int sum=0;
      for(int i=3;i<=n;i++)
      {
            sum=ow+aw;
            ow=aw;
            aw=sum;
      }
      return sum;
          }
}