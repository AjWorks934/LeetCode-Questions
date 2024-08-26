class Solution {
    public int[] sortArray(int[] nums) {
        MergeSort(0,nums.length-1,nums);
        return nums;
    }
    public static void MergeSort(int s,int e,int [] arr)
    {   
        int mid = (s+e)/2;
        if(s<e){
        //System.out.println( s+" "+ mid+" "+e+" ");
        MergeSort(s,mid,arr);
        MergeSort(mid+1,e,arr);
        Merge(s,mid,e,arr);
        }
        return;
    }
    public static void Merge(int s,int m,int e,int arr[])
    {
        int nums[]=new int[e-s+1];
        int i=s;int j=m+1;int k=0;
        while(i<=m && j<=e)
        {
            if(arr[i]<arr[j]){
            nums[k]=arr[i];
            k++;i++;
            }
            else
            {
                nums[k]=arr[j];
                k++;
                j++;
            }
        }
            if(i>m)
            {
                while(j<=e)
                {
                nums[k]=arr[j];
                k++;j++;
                }
            }
            if(j>e)
            {
                while(i<=m)
                {
                nums[k]=arr[i];
                k++;i++;
                }
            }
            for(int p=0;p<nums.length;p++)
            {
                arr[s+p]=nums[p];
            }
        }
}