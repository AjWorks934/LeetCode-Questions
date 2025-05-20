class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int t[]=new int[6];
        int b[]=new int[6];
        int s[]=new int[6];
        for(int i=0;i<tops.length;i++){
            if(tops[i]==bottoms[i])
            s[tops[i]-1]++;
            else{
            t[tops[i]-1]++;
            b[bottoms[i]-1]++;
            }
        }
        for(int i=0;i<6;i++){
            if(s[i]+t[i]+b[i]==tops.length)
                return Math.min(tops.length-t[i]-s[i],bottoms.length-b[i]-s[i]);
        }
        return -1;
    }
}