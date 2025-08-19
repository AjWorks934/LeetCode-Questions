class NumArray {
    int arr[];
    public NumArray(int[] nums) {
        arr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
    }
    public int sumRange(int left, int right) {
        int sum=0; int pref[]=new int[arr.length];
        pref[0]=arr[0];
     for(int i=1;i<arr.length;i++){
        pref[i]=pref[i-1]+arr[i];
     }   
    // System.out.println(Arrays.toString(pref));
     if(left==0)
     return pref[right];
     else
     return pref[right]-pref[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */