class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length())
            return "";

        HashMap<Character,Integer> mt=new HashMap<>();
        for(int i=0;i<t.length();i++){
            mt.put(t.charAt(i),mt.getOrDefault(t.charAt(i),0)+1);
        }
        int count=0;int l=0; String ans="";
        int stidx=0;int endidx=0; int len=Integer.MAX_VALUE;
        for(int r=0;r<s.length();r++){
            char cs=s.charAt(r);
           if(mt.containsKey(cs)){
            mt.put(cs,mt.get(cs)-1);
            if(mt.get(cs)>=0)
             count++;
            }
            while(count==t.length()){
                
                char ch=s.charAt(l);
                if(mt.containsKey(ch)){
                mt.put(ch, mt.get(ch) + 1);
                    if(mt.get(ch)>0){
                        if(len>=r-l+1){
                            len=r-l+1;
                            ans=s.substring(l,r+1);
                        }
                        count--;
                    }
                }
                l+=1;
            }
        }
        return ans;
    }
}