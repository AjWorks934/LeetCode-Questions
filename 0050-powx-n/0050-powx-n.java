class Solution {
    public double pow(double x,long n){
        if(n==0)
        return 1;
        if(n<0)
        return pow(1/x,-n);
        double sub=pow(x,n/2);
        double ans=sub*sub;
        if(n%2==1)
        ans=ans*x;
        return ans;
    }
    public double myPow(double x, int n) {
        return pow(x,n);
}
}