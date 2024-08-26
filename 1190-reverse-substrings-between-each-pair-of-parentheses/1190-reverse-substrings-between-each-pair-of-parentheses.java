import java.util.Stack;
class Solution {
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        //StringBuffer x= new StringBuffer();
        String x="";
        int i=0;
      while(i<s.length())
       {   String ex="";
        while( i<s.length() && s.charAt(i)!='(' && s.charAt(i)!=')' )
            {  
                ex=ex+s.charAt(i);
                i++;
            }
        if(ex!="")
            stack.push(ex);
        if(i<s.length() && s.charAt(i)=='(')
            stack.push("(");
        if(i<s.length() && s.charAt(i)==')')
            {   x="";
                while(!stack.isEmpty() && stack.peek()!="(")
                {
                 x=stack.pop()+x;//.toString();
                }
           if(!stack.isEmpty())
            stack.pop();
            StringBuffer rev= new StringBuffer(x);
            rev.reverse();
            x=rev.toString();
            String y="";
            if(!stack.isEmpty() && stack.peek()!="(")
            y=stack.pop();
            x=y+x;//.toString();
            stack.push(x);//.toString());
        }
            i++;
      }
      x="";
      while(!stack.isEmpty()) 
        x=stack.pop()+x;
    return x;

  }
}