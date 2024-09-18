import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
       Map <Character,Integer> mp=new HashMap<>();
       for(char c : s.toCharArray()){
       mp.put(c,mp.getOrDefault(c,0)+1);//we keep track of freq of all char in string
    }
    for(char c : t.toCharArray()){
       mp.put(c,mp.getOrDefault(c,0)-1);}//we will reduce the freq of matching chars in the other string
       Collection<Integer> val= mp.values();
       for(int v: val){
        if(v!=0)//if some value of the map is not 0 that means in was not there in t or was extra.
        return false;
       }
       return true;
    }
}