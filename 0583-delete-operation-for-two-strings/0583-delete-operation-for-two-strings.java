class Solution {
    public int minHelper(String s1, int i, String s2, int j,int arr[][]){
        if(i==0|| j==0)
        return 0;
        if(arr[i][j]!=-1)
            return arr[i][j];
        else{
        if(s1.charAt(i-1)==s2.charAt(j-1))
        arr[i][j]= 1+minHelper(s1,i-1,s2,j-1,arr);
        else{
            arr[i][j]= Math.max(minHelper(s1,i,s2,j-1,arr),minHelper(s1,i-1,s2,j,arr));
            }
        }
    return arr[i][j];
    }
    public int minDistance(String word1, String word2) {
        int arr[][]=new int[word1.length()+1][word2.length()+1];
        for(int row []:arr){
            Arrays.fill(row,-1);
        }
        return (word1.length()+word2.length())-(2*minHelper(word1,word1.length(),word2,word2.length(),arr));
    }
}