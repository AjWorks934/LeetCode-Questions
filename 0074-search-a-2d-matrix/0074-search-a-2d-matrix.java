class Solution {
    public boolean binary(int row,int matrix[][],int target){
        int s=0;int e=matrix[0].length;
        while(s<e){
            int mid=s+(e-s)/2;
            if(matrix[row][mid]>target){
                e=mid;
            }
            else if(matrix[row][mid]==target){
                return true;
            }
            else
            s=mid+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;int n=matrix[0].length;
        int r=0;
          for(int i=0;i<m;i++){
            if(target>matrix[i][n-1])
            continue;
            else
            {
                r=i;
                break;
            }
          }
          if(binary(r,matrix,target)){
            return true;
          }
        return false;
    }
}