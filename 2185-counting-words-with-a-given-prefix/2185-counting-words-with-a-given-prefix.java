class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;int x=0;
        for(int i=0;i<words.length;i++){
            x=0;
            for(int j=0;j<pref.length();j++)
            {   if(words[i].length()>=pref.length()){
                    if(words[i].charAt(j)==pref.charAt(j))
                    x++;
                }
            }
            if(x==pref.length())
            count++;
        }
        return count;
    }
}