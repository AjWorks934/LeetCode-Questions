class Solution {
    public int minfind(int[] arr){
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[min])
            min=i;
        }
        return min;
    }
    
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int minidx=minfind(nums);
            nums[minidx]*=multiplier;
        }
        return nums;
    }
}