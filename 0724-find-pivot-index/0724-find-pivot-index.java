class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        int pre[]=new int[n];
        pre[0]=0;
        int suf[]=new int[n];
        suf[n-1]=0;
        for(int i =1;i<n;i++){
            pre[i]=pre[i-1]+arr[i-1];
        }
        for(int i =n-2;i>=0;i--){
            suf[i]=suf[i+1]+arr[i+1];
        }
        for(int i =0;i<n;i++){
            if(pre[i]==suf[i])
                return i;
        }
        return -1;
    }
}