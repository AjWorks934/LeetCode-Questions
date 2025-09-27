class Solution {
    public int MOD=1_000_000_007;
    public int maxSumMinProduct(int[] nums) {
        int n=nums.length;
        // long ans=0;

        // for(int i=0;i<n;i++){
        //     long sum=0;
        //     long min=Integer.MAX_VALUE;
        //     for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         if(nums[j]<min) min=nums[j];

        //         long cal=(min*sum);
        //         ans=Math.max(ans,cal);
        //         // ans=(ans+cal)%MOD;
        //     }
        // }
        // return (int)(ans %MOD);



        //  O(n)

        Stack<Integer> st= new Stack<>();
        int []pse=new int [n];
        int []nse=new int [n];

        pse[0]=-1;
        nse[n-1]=n;
        // pse

        st.push(0);

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]) st.pop();
            if(st.isEmpty()) pse[i]=-1;
            else  pse[i]=st.peek();
            st.push(i);
        }

        while(!st.isEmpty()) st.pop();

        st.push(n-1);
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]) st.pop();
            if(st.isEmpty()) nse[i]=n;
            else  nse[i]=st.peek();
            st.push(i);
        }

        long []pre=new long [n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        long ans=0;

        for(int i=0;i<n;i++){
            int l=pse[i];
            int r=nse[i];
            long sum=0;
            if(l==-1) sum=pre[r-1];
            else sum =pre[r-1]-pre[l];
            long prod=nums[i]*sum;
            ans=Math.max(ans,prod);
        }
        return (int) (ans%MOD);

    }
    
}
