class Solution {
    public void moveZeroes(int[] nums) {
      int p1=0;int p2=0;
      while(p2<nums.length){
        if( nums[p2]!=0){
            int temp=nums[p2];
            nums[p2]=nums[p1];
            nums[p1]=temp;
            p1++;
            }
            p2++;
        }
    }
}