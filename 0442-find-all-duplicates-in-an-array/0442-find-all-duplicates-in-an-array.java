class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hm=new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(hm.contains(nums[i]))
            {
                ans.add(nums[i]);
            }
            hm.add(nums[i]);   
    }
    return ans;   
    }
}