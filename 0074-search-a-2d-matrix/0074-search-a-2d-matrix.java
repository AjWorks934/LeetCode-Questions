class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int columnsize=matrix.length;int rowsize=matrix[0].length;
            int s=0,e=rowsize*columnsize-1;
           while(s<=e){
            int mid =s+(e-s)/2;
            if(matrix[mid/rowsize][mid%rowsize]==target){
                return true;
            }
            else if(matrix[mid/rowsize][mid%rowsize]>target){
                e=mid-1;
            }
            else{
               s=mid+1;
            }
           }        
        return false;
    }
}