import java.util.*;
class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;
    int min;
    public MinStack() {
        st=new Stack<>();
        minst=new Stack<>();
        
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty()){
            minst.push(val);
        }
        else
        {
            if(minst.peek()>=val)
                minst.push(val);
        }
    }
    
    public void pop() {
        if(!st.isEmpty())
            {
                if(minst.peek().equals(st.peek()))
                {
                minst.pop();
                }
            st.pop();
            }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        if(!st.isEmpty()){
            min = minst.peek();
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */