class Solution {
    public int longestPalindromeSubseq(String s) {
        String s2="";
        for(int i=s.length()-1;i>=0;i--){
            s2=s2+s.charAt(i);
        }
        int arr[][]=new int[s.length()+1][s2.length()+1];
        for (int[] row: arr)
        Arrays.fill(row,0);
        int ll=LCSTD(s,s.length(),s2,s2.length(),arr);
        return ll;
    }
        public static int LCSTD(String s1,int n,String s2,int m,int arr[][])
        {
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    if(s1.charAt(i-1)==s2.charAt(j-1))
                        arr[i][j]= 1+arr[i-1][j-1];
                    else
                        arr[i][j]= Math.max(arr[i][j-1],arr[i-1][j]);
                }
            }
       // for(int i=0;i<=n;i++){
           //     for(int j=0;j<=m;j++){
            //        System.out.print(arr[i][j]+" ");
            //    }
            //    System.out.println();
       // }
        return arr[n][m];
    }
}