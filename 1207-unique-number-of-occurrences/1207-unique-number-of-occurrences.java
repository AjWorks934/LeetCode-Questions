import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        Collection<Integer> val = freq.values();
        HashSet<Integer> st = new HashSet<>(freq.values());
        if(val.size() == st.size())
        return true;
        else 
        return false;
    }
}