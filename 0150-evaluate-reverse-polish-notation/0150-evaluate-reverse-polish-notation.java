class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(tokens[i].equals("+"))
            {
                int x=st.pop();
                int y= st.pop();
                st.push(x+y);
            }
            else if(tokens[i].equals("/"))
            {
                int x= st.pop();
                int y= st.pop();
                st.push(y/x);
            }
            else if(tokens[i].equals("-"))
            {
                int x= st.pop();
                int y= st.pop();
                st.push(y-x);
            }
            else if(tokens[i].equals("*"))
            {
                int x= st.pop();
                int y= st.pop();
                st.push(x*y);
            }
            else
            st.push(Integer.parseInt(tokens[i])); 
        }
        return st.peek();
    }
}