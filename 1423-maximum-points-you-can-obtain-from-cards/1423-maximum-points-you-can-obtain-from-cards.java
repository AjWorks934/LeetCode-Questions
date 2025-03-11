class Solution {
    public int maxScore(int[] arr, int k) {
        int max =0,lsum=0,rsum=0;int n=arr.length;
        for(int i=0;i<k;i++){
            lsum+=arr[i];
        }//calc lsum
        int ans=lsum;int idx=k-1;
        for(int i=n-1;i>n-k-1;i--){//keep checking with lsum +rsum giving out maximum after reducing lsum.
            rsum+=arr[i];
            lsum-=arr[idx];
            ans=Math.max(ans,lsum+rsum);
            idx--;
        }
        return ans;
    }
}