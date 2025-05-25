class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
       Arrays.sort(happiness);
       long happi=0;int c=0;
       for(int i=happiness.length-1;i>=0;i--){
        if(c==k)
        return happi;
        if(happiness[i]-c>0)
        happi+=happiness[i]-c;
        c++;
       }
       return happi;
    }
}