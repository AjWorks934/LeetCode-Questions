import java .util.*;
class Solution {
    String keys[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    //String com="";
    List<String> str=new ArrayList<String>();
    public List<String> letterCombinations(String digits) {
        helper(digits,0,"");
        return str;
    }
    public void helper(String digits, int ind,String com){
        if(ind==digits.length()){//when all digit inputs covered
            if(!com.equals(""))//for no digit input
        str.add(com);
        return;}
        char current=digits.charAt(ind);//current digit 
        //System.out.println(current);
        String mapstr = keys[current-'2'];//letters mapped to that key
        for(int i=0;i<mapstr.length();i++)
        {
           helper(digits,ind+1,com+mapstr.charAt(i));
           System.out.println(mapstr.charAt(i)+" "+com);
           //com is combinations string
        }
        }
}