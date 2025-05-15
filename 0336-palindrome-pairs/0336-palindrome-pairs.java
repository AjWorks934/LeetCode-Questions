class Solution {
    public boolean isPalindrome(String str){
         int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;      
            }
            i++;
            j--;
        }
        return true;      
    }
    public String reverse(String str)
    {
        StringBuilder res = new StringBuilder(str);
        res.reverse();
        return res.toString();
    }
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ans=new ArrayList<>();
        HashMap<String,Integer> mpr= new HashMap<>();
        for(int i=0;i<words.length;i++){
            mpr.put(reverse(words[i]),i);
        }
        for(int i=0;i<words.length;i++){
             if(words[i].equals(""))
                    continue;
            //case 1:
            if(mpr.containsKey(words[i]) && mpr.get(words[i])!=i)
            {
                ans.add(new ArrayList<>(Arrays.asList(i,mpr.get(words[i]))));
            } 
            //case 2
            else if(isPalindrome(words[i]) && mpr.containsKey("")){
                ans.add(new ArrayList<>(Arrays.asList(i,mpr.get(""))));
                ans.add(new ArrayList<>(Arrays.asList(mpr.get(""),i)));
            }
            //case 3  
                String pf=new String();
                String sf=new String();
                for(int j=1;j<words[i].length();j++){
                    pf=words[i].substring(0,j);
                    sf=words[i].substring(j);
                    if(isPalindrome(pf))
                    {
                        if(mpr.containsKey(sf))
                        ans.add(new ArrayList<>(Arrays.asList(mpr.get(sf),i)));
                    }
                    if(isPalindrome(sf))
                    {
                        if(mpr.containsKey(pf))
                        ans.add(new ArrayList<>(Arrays.asList(i,mpr.get(pf))));
                    }
                }
            
        }
        return ans;
    }
}