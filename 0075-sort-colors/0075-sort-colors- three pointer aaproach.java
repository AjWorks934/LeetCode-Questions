class Solution {
    public void sortColors(int[] nums) {
    int l=0;
    int c=0;
    int r=nums.length-1;
    while(c<=r){
        if(nums[c]==0){
        Swap(l,c,nums);
        l++;
        c++;
        }
        else if(nums[c]==1){
            c++;
        }
        else{
        Swap(r,c,nums);
        r--;
        }
    }
    }
    public static void Swap(int a, int b,int nums[]){
       int x=nums[a];
        nums[a]=nums[b];
        nums[b]=x;
    }
}