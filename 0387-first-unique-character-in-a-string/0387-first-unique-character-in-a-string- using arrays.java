class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> stp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            stp.put(s.charAt(i),stp.getOrDefault(s.charAt(i),0)+1);
        }
         for(int i=0;i<s.length();i++){
        if(stp.get(s.charAt(i))==1)
           return s.indexOf(s.charAt(i));
         }
         return -1;
    }
}