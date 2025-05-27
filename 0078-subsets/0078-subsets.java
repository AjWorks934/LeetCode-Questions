class Solution {
    List<List<Integer>> ans=new ArrayList<>();
public void solve(int []nums,List<Integer> set,int i,int n){
    System.out.println(set);
        if(i>n-1){
            ans.add(new ArrayList<>(set));
            return;
        }
        set.add(nums[i]);
        solve(nums,set,i+1,n);
        set.remove(set.size()-1);
        solve(nums,set,i+1,n);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> set=new ArrayList<>();
        solve(nums,set,0,nums.length);
        return ans;
    }
}