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
    public int[] leftGreater(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer> st= new Stack<>();
        int ar[]=new int[n];
        //st.push(-1);
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.isEmpty())
                ar[i]=-1;
            else
            ar[i]=st.peek();
            st.push(i);
        }
        //System.out.println("lg"+Arrays.toString(ar));
        return ar;
    }
    public int[] rightGreater(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer> st= new Stack<>();
        int ar[]=new int[n];
        //st.push(-1);
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty())
                ar[i]=n;
            else
            ar[i]=st.peek();
            st.push(i);
        }
        //System.out.println("rg"+Arrays.toString(ar));
        return ar;
    }
    public long sumLargest(int nums[]){
        long sum=0;
        int lg[]=new int[nums.length];
        int rg[]=new int[nums.length];
        lg=leftGreater(nums);
        rg=rightGreater(nums);
        for(int i=0;i<nums.length;i++){
            long tt= (i-lg[i])*(rg[i]-i);
            sum=sum+nums[i]*tt;
        }
        //System.out.println("l"+sum);
        return sum;
    }
    public long sumSmallest(int nums[]){
        long sum=0;
        int ls[]=new int[nums.length];
        int rs[]=new int[nums.length];
        ls=leftSmaller(nums);
        rs=rightSmaller(nums);
        for(int i=0;i<nums.length;i++){
            long tt= (i-ls[i])*(rs[i]-i);
            sum=sum+nums[i]*tt;
        }
        //System.out.println("s"+sum);
        return sum;
    }
    public long subArrayRanges(int[] nums) {
        long ans=sumLargest(nums)-sumSmallest(nums);
        return ans;
    }
}