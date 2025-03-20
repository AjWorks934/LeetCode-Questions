class Solution {
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;int cir=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
            cir=i;
            break;
            }
        }
        int min=n-1;
        if(cir!=-1){
        for(int i=n-1;i>cir;i--){
            if(nums[i]>nums[cir]){
            min=i;
            break;
        }
        }
        //swap(arr,cir,min);
        int temp = nums[min];
            nums[min] = nums[cir];
            nums[cir] = temp;
        }
        System.out.println(min);
        System.out.println(cir);
        System.out.println(Arrays.toString(nums));
        reverse(nums,cir+1,n-1);
    }

}