class Solution {
    public String reverseWords(String s) {
        String result =new String();
        for(int i=s.length()-1;i>=0;i--)
        { StringBuilder w=new StringBuilder();
            if(s.charAt(i)!=' ')
            {
            int j=i;
            while(j>=0 && s.charAt(j)!=' ' )
            {
                 w.append(s.charAt(j));
                 j--;
                 i--;
            }
            w.reverse();
            
            result=result +w.toString()+" ";
        }
        }
        return result.trim();
    }
}
