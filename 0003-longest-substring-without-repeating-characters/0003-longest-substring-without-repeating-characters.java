class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hp=new HashSet<>();
       int len=0;int i=0;
        while(i<s.length()){
            for(int j=i;j<s.length();j++){
                if(hp.contains(s.charAt(j))){
                    hp.clear();
                    break;
                }
                hp.add(s.charAt(j));
                len=Math.max(len,j-i+1);      
            }
            i++;
        }
        return len;
    }
}