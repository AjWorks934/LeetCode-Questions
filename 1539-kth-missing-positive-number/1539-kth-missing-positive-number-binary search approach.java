class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l=0;int r=arr.length-1;int miss=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            miss=arr[mid]-(mid+1);
            if(miss<k){
                l=mid+1;
            }
            else
            r=mid-1;
        }
        return k+l;
    }
}