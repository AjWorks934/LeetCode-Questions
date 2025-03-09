class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
       // if(nums[0] < nums[n-1]) 
        //count++;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] >  nums[(i+1)%n]) 
            count++;
            if(count > 1) 
            return false;
        }
        return true; 
    }
}
/*
brute 
first make a copy sorted. then search a[0] in original array. then run operation of comparison b/w both arrays in sequential order. stop if ther id any mismatch return false or when i =n(all elements of copy array checked return true). also since we need to check in round all elements we do i%n/*/