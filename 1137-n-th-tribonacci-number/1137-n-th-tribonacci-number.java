class Solution {
    public int tribonacci(int n) {
        int trib=0;
        if(n==0)
         trib= 0;
        if(n==1)
        trib= 1;
        if(n==2)
        trib=1;
        //return fib(n-1)+fib(n-2);
        int p=0,q=1,r=1;
        for(int i=2;i<n;i++){
            trib=p+q+r;
            p=q;
            q=r;
            r=trib;
        }
        return trib;
    }
}
    
