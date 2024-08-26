class Solution {
    public double myPow(double x, int n) {
        if(n==0)// || n==-0)
           return 1;
        if(x==0)
             return 0;
        if(n<0)
        {
            x=1/x;
            n=-n;
        }
        
        /* if(n%2==0)
                return myPow(x,n/2)*myPow(x,n/2);
            else
                return myPow(x,n/2)*myPow(x,n/2)*x;
        */
        double pow=1;
        while(n!=0){
            if(n%2!=0)
            {
                pow=pow*x;
            }
            x=x*x;
            n=n/2;
        }
        
      return pow;  
    }
}