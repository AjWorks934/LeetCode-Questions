class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s1=m-1;int s2=n-1;int i=nums1.length-1;
        while(i>=0 && s2>=0)
        {
           while(s1>=0 && s2>=0)
           { if(nums1[s1]>=nums2[s2])
            {
              nums1[i]=nums1[s1];
               s1--;
               i--;
            }
            else{
            nums1[i]=nums2[s2];
            s2--;
            i--;
            }
           }
        if(s1>s2)
        {
            nums1[i]=nums1[s1];
            s1--;
        }
        else{
              nums1[i]=nums2[s2];
            s2--;
        }
        //System.out.println(nums1[i]);
        i--;
        }
    }
}