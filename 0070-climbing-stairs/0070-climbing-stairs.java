class Solution {
    public int climb(int n,int arr[]){
       if(n==1 || n==0)
       return 1;
       if(n==2)
       return 2;
       if(arr[n]!=-1)
       return arr[n];
       arr[n]=climb(n-1,arr)+climb(n-2,arr);
       return arr[n];
    }
    public int climbStairs(int n) {
       int arr[]=new int[n+1];
       Arrays.fill(arr,-1);
       return climb(n,arr);
       }
}