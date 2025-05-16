class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        // intially the length will be 0
        int longest = 1;
        HashSet<Integer> set  = new HashSet<>();
        //adding all the elements into the set and it allows only unique elements
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        //check whether the the next smallest number of the current number exists or not.
        for(int it:set){
            if(!set.contains(it - 1)){
                int cnt = 1;
                int x = it;
                //if yes then check for the consecutive numbers of the curret number by increasing it to x++
                while(set.contains(x + 1)){
                    x = x + 1;
                    cnt = cnt + 1;
                }
                //return the maximum of longest and the cnt
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}