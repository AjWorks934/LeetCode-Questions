class Solution {
    public int[] nextGreaterElements(int[] nums) {
      Stack<Integer> st= new Stack<>();
      int arr[]=new int[nums.length];
     int n=nums.length;
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr,-1);
        }

        // Iterate twice to handle circular array, starting from 2*n-1 down to 0
        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n; // Circular index

            // Pop elements from the stack that are less than or equal to the current element
            while (!st.isEmpty() && st.peek() <= nums[idx]) {
                st.pop();
            }

            // If i < n and stack is not empty, set the next greater element
            if (i < n && !st.isEmpty()) {
                arr[idx]=st.peek();
            }

            // Push the current element onto the stack
            st.push(nums[idx]);
        }

        return arr;
    }
}