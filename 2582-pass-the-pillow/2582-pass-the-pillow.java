import java.util.*;
class Solution {
    public int passThePillow(int n, int time) {
       int d=1;
       int p=1;
       while(time>0)
       {
        if(p>=n||p==-1)
            d=-1;
        else
            d=1;
        p=p*d+1;
        //System.out.println(p+"->");
        time--;
       }
       return Math.abs(p);
    }
}