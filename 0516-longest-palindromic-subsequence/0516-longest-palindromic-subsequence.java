class Solution {
    public int longestPalindromeSubseq(String s) {
        String s2="";
        for(int i=s.length()-1;i>=0;i--){
            s2=s2+s.charAt(i);
        }
        int arr[][]=new int[s.length()+1][s2.length()+1];
        for (int[] row: arr)
        Arrays.fill(row,-1);
        int ll=LCSTD(s,s.length(),s2,s2.length(),arr);
        return ll;
    }
        public static int LCSTD(String s1,int i,String s2,int j,int arr[][]){
        if(i==0||j==0){
            return 0;
        }
        if(arr[i][j]!=-1)
            return arr[i][j];
        else{
            if(s1.charAt(i-1)==s2.charAt(j-1))
                arr[i][j]= 1+LCSTD(s1,i-1,s2,j-1,arr);
            else
                arr[i][j]= Math.max(LCSTD(s1,i,s2,j-1,arr),LCSTD(s1,i-1,s2,j,arr));
            return arr[i][j];
        }
    }
}