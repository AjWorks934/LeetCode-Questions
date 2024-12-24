class Solution {
    public int tribhelp(int n,int arr[]){
        if(n<=0)
        return 0;
        if(n<=2)
        return 1;
        if(arr[n]!=0)
        return arr[n];
        arr[n]=tribhelp(n-1,arr)+tribhelp(n-2,arr)+tribhelp(n-3,arr);
        return arr[n];
    }
    public int tribonacci(int n) {
        int arr[]=new int[n+1];
        Arrays.fill(arr,0);
        return tribhelp(n,arr);
    }
}
    
