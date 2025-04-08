class Solution {
    public String removeOuterParentheses(String s) {
        int k=0;int c=0;
        String ans="";
        Stack<Character> st=new Stack<>();
        while(k<s.length()){
           if(s.charAt(k)=='('){
            c++;
            if(c>1){
                ans=ans+"(";
            }
           }
           if(s.charAt(k)==')'){
            if(c>1){
                ans=ans+")";
            }
            c--;
           }
           k++;
        }
        return ans;
    }
}