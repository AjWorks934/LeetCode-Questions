import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0] );//sorting the intervals based on first index of each interval
        
        ArrayList<int[]> newint= new ArrayList<>();
        int s=intervals[0][0];
        int e= intervals[0][1];
        for(int i=1;i<intervals.length;i++){
             if(e>=intervals[i][0]){
               if(e<=intervals[i][1])
                e=intervals[i][1];
            }
            else{
            newint.add(new int[] {s,e});//adding rows to lists
            s=intervals[i][0];
            e=intervals[i][1];
            }
        }
        newint.add(new int[] {s,e});
    return newint.toArray(new int[newint.size()][]);
}
}