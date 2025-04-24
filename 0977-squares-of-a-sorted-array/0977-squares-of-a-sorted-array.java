class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int i=0;int j=nums.length-1; int k=j;
        while(i<=j){
            int is=(int)Math.pow(nums[i],2);
            int js=(int)Math.pow(nums[j],2);
            if(is<js){
                ans[k]=js;
                j--;
            }
            if(is>=js){
                ans[k]=is;
                i++;
            }
            k--;
        }
        return ans;
    }
}