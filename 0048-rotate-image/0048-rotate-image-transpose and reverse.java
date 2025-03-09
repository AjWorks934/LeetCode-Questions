class Solution {
    public static void reverse(int arr[][],int i,int s,int l){
        int k=0;
        while(s<l){
            int temp=arr[i][s];
            arr[i][s]=arr[i][l];
            arr[i][l]=temp;
            s++;
            l--;
        }
    }
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;            
            }    
        }
         for(int i=0;i<matrix.length;i++){
            reverse(matrix,i,0,matrix.length-1);
    }
}
}