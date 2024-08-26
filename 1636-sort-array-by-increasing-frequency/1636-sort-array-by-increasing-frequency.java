class Solution {
    public int[] frequencySort(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> fmap=new HashMap<>();
        int c=0;
        for(int i=0;i<nums.length;i++)
        {   if(i>0 && (nums[i-1]!=nums[i]))
            c=0;
            fmap.put(nums[i],++c);
        }
        Integer arr[] =new Integer[nums.length];
        for(int i=0;i<nums.length;i++)
            arr[i]=nums[i];
        Arrays.sort(arr,(lhs,rhs) -> {
            if(fmap.get(lhs).equals(fmap.get(rhs)))
                return Integer.compare(rhs,lhs);//descending
            else
                return Integer.compare(fmap.get(lhs),fmap.get(rhs));

        });
             for(int i=0;i<nums.length;i++)
            nums[i]=arr[i];
    return nums;
    }
}