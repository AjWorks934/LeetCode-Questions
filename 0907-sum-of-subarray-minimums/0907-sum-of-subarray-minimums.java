class Solution {
    public int[] leftSmaller(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer> st= new Stack<>();
        int ar[]=new int[n];
        //st.push(-1);
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty())
                ar[i]=-1;
            else
            ar[i]=st.peek();
            st.push(i);
        }
        //System.out.println("ls"+Arrays.toString(ar));
        return ar;
    }
    public int[] rightSmaller(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer> st= new Stack<>();
        int ar[]=new int[n];
       // st.push(-1);
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty())
                ar[i]=n;
            else
            ar[i]=st.peek();
            st.push(i);
        }
       // System.out.println("rs"+Arrays.toString(ar));
        return ar;
    }
    public int sumSubarrayMins(int[] nums) {
        int sum=0; int MOD=1000000007;
        int ls[]=new int[nums.length];
        int rs[]=new int[nums.length];
        ls=leftSmaller(nums);
        rs=rightSmaller(nums);
        for(int i=0;i<nums.length;i++){
            long tt= (i-ls[i])*(rs[i]-i);
            sum=(int)((sum+nums[i]*tt)%(MOD));
        }
        //System.out.println("s"+sum);
        return sum%(MOD);
    }
}