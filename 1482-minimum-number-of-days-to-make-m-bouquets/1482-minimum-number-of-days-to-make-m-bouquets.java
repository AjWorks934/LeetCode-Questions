class Solution {
    public boolean bloom(int []bloomDay,int m,int k,int currday){
//search for each day is it possible to create m boquet if yes return true else return false.
    int count=0;
    for(int i=0;i<bloomDay.length;i++){
        if(bloomDay[i]<=currday){
            count++;
            if(count==k){
                m--;
                count=0;
            }
        }
        else{
            count=0;
        }
     }
     return m<=0;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length)
        return -1;
        int l=Integer.MAX_VALUE;int r=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            l=Math.min(bloomDay[i],l);
            r=Math.max(bloomDay[i],r);
        }
        while(l<r){
            int mid=l+(r-l)/2;
            if(bloom(bloomDay,m,k,mid)){
                r=mid;
            }
            else
            l=mid+1;
        }
        return l;
    }
}