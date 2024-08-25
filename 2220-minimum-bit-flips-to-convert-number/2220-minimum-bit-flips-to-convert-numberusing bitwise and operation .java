class Solution {
    public int minBitFlips(int start, int goal) {
        int newnum = start^goal;int count =0;
       while(newnum!=0){
        if((newnum & 1) == 1)
        {
            count++;
        }
        newnum=newnum>>1;
    }
        return count;
    }
}