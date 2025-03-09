class Solution {
    public static void reverse(int arr[],int s,int l){
        int k=0;
        while(s<l){
            int temp=arr[s];
            arr[s]=arr[l];
            arr[l]=temp;
            s++;
            l--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int x=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,x-1);
        reverse(nums,x,n-1);
    }//check gcd slgo
}