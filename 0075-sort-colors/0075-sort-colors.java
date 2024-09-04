class Solution {
    public void sortColors(int[] nums) {
        int z=0;
        int o=0;int t=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            z++;
            else if(nums[i]==1)
            o++;
            else
            t++;
        }
        for(int i=0;i<z;i++)
        {
            nums[i]=0;
            System.out.println(nums[i]);
        }
        for(int j=z;j<o+z;j++)
        { 
            nums[j]=1;
            System.out.println(nums[j]);
        }
        for(int k=o+z;k<t+o+z;k++)
        {
            nums[k]=2;
            System.out.println(nums[k]);
        }
    }
}