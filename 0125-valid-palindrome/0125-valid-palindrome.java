import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
      /*  if((str.charAt(0)<97 && (str.charAt(0)<48 || str.charAt(0)>57 ) ) || str.charAt(0)>122)
            {
                if(str.charAt(0)==s.charAt(str.length()-1))
            { 
        String s1="";
        for(int i=0;i<str.length();i++)
        {
        if((str.charAt(i)>=97 && str.charAt(i)<=122 )||(str.charAt(i)>=48 && str.charAt(i)<=57 ))
        {
            s1= s1+str.charAt(i);
        }
        }
        StringBuilder str1= new StringBuilder();
        str1.append(s1);
        str1.reverse();
        String str2=str1.toString();
        System.out.println(str2+" "+s1);
        if(str2.equals(s1))
        return true;
        else
        return false;
}else 
return false;
            
            }
else 
            {*/
               
        String s1="";
        for(int i=0;i<str.length();i++)
        {
        if((str.charAt(i)>=97 && str.charAt(i)<=122 )||(str.charAt(i)>=48 && str.charAt(i)<=57 ))
        {
            s1= s1+str.charAt(i);
        }
        }
        StringBuilder str1= new StringBuilder();
        str1.append(s1);
        str1.reverse();
        String str2=str1.toString();
        if(str2.equals(s1))
        return true;
        else
        return false; 
            }
}