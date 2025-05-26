class Solution {
     public int pow(long x,long n){
        if(n==0)
            return 1;
        long sub=pow(x,n/2);
        long ans=(sub*sub)%(1000000007);
        if(n%2==1)
         ans=(ans*x)%(1000000007);
        return (int) ans;
    }
    public int countGoodNumbers(long n) {
            long even=(n+1)/2;
            long odd=(n)/2;
            long res =   (pow(5,even)*1L*pow(4,odd))%(1000000007);
            return (int) res;
    }
}