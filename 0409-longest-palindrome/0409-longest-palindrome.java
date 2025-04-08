class Solution {
    public int longestPalindrome(String s) {
        int max=0;int len=0;
        HashMap<Character,Integer> hp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hp.put(s.charAt(i),hp.getOrDefault(s.charAt(i),0)+1);
        }
        boolean flag=false;
        for(char c:hp.keySet()){
            if(hp.get(c)%2==0)
            len+=hp.get(c);
            if(hp.get(c)%2!=0){
                len+=hp.get(c)-1;
                flag=true;
            }
        }
        if(flag==true)
        len++;
        return len;
    }
}