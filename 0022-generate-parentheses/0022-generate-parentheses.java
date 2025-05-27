class Solution {
    List<String> ans=new ArrayList<>();
    void solve(int o,int c,String temp){
        if(o==0 && c==0){
            ans.add(temp);
            return;
        }
        if(o==0){
        solve(o,c-1,temp+")");
        }
        else if(o==c){
            solve(o-1,c,temp+"(");
        }
        else{
            solve(o-1,c,temp+"(");
            solve(o,c-1,temp+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        String temp="";
        solve(n,n,temp);
        return ans;
    }
}