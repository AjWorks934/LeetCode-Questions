class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int ans=0;
        HashSet<Integer> hp=new HashSet<>();
        for(int i=0;i<banned.length;i++){
            hp.add(banned[i]);
        } 
            int sum=0;
        for(int i=1;i<=n;i++){
            if(hp.contains(i))
                continue;
            int temp=sum+i;
            if(temp>maxSum)
                return ans;
            sum=temp;
            ans++;
        }
        return ans;
    }
}