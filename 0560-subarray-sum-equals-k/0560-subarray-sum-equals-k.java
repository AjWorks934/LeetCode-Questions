class Solution {
    public int subarraySum(int[] nums, int k) {
        int max[]=new int[nums.length];
        int c=0; 
       HashMap<Integer,Integer> hp=new HashMap<>();
       int pref[]=new int[nums.length];
       pref[0]=nums[0];
       hp.put(0,1);
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(hp.containsKey(pref[i]-k));
            c+=hp.getOrDefault(pref[i]-k,0);
            hp.put(pref[i],hp.getOrDefault(pref[i],0)+1);
        }
        return c;
    }
}