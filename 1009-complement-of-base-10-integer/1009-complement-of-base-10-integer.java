class Solution {
    public int bitwiseComplement(int n) {
        int x=n;int bitm=1;
        if(n==0)
        return 1;
        while(n!=1){//creating bitmask i.e counting no. of bits upto the last 1 in input and creating a bitmask of that length with 1s.
             n=n>>1;
             System.out.println(n+" @");
            bitm=bitm<<1;
            System.out.println(bitm+" ,");
            bitm=bitm|1;
             System.out.println(bitm+" ,");
           
             
        }
        int c=~x;
        int ans=c&bitm;//extracting that length ans complement
        return ans;
    }
}