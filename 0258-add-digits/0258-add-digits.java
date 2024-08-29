class Solution {
    public int addDigits(int n) {
         int rev=0;
         while(n!=0){
        rev=rev+n%10;
        n=n/10;
    }
    if(rev>9)
    return addDigits(rev);
return rev;

}
}