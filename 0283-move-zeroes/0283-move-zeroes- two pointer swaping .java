class Solution {
    public void moveZeroes(int[] nums) {
      int p1=0;int p2=1;
      while(p2<nums.length){

       if(nums[p1]==0 && nums[p2]!=0){
        int temp=nums[p2];
        nums[p2]=nums[p1];
        nums[p1]=temp;
        p1++;p2++;
      } 
      else if(nums[p1]==0 && nums[p2]==0)//when both are 0 we do not increment p1
      p2++;
      else
      { p1++;p2++;}
    }
}
}