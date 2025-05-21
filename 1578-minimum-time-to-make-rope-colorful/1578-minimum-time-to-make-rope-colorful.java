class Solution {
    public int minCost(String colors, int[] neededTime) {
        //StringBuilder str=new StringBuilder(colors);
        int tt=0;int pre=0;
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(pre)==colors.charAt(i))
            {
                    tt+=Math.min(neededTime[pre],neededTime[i]);
                    if(neededTime[pre]<neededTime[i])
                    pre=i;
            }
          else{
            pre=i;
          }
        }
        return tt;
    }
}