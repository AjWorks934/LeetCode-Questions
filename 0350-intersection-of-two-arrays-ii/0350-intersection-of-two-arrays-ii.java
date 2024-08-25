import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int i=0,j=0,k=0;
       while(i<nums1.length && j<nums2.length)
       {
           if(nums1[i]==nums2[j])
           {
            nums1[k]=nums1[i];
            i++;
            k++;
            j++;
           }
        else if(nums1[i]>nums2[j])
            j++;
        else
            i++;
       }
       int ar[]=new int[k];
     for (int p= 0; p<k; p++)
            ar[p] = nums1[p];

    return ar;
    }
}