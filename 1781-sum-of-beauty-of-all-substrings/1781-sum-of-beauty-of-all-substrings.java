import java.util.*;

class Solution {
    public int beautySum(String s) {
        int sum = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];
            
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++; 
                int maxFreq = 0, minFreq = Integer.MAX_VALUE;
                
                for (int count : freq) {
                    if (count > 0) {
                        maxFreq = Math.max(maxFreq, count);
                        minFreq = Math.min(minFreq, count);
                    }
                }
                sum += maxFreq - minFreq;
            }
        }
        
        return sum;
    }
}
