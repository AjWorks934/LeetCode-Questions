import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0] );//sorting the intervals based on first index of each interval
        
        ArrayList<ArrayList<Integer>> newint= new ArrayList<>();
        int s=intervals[0][0];
        int e= intervals[0][1];
        for(int i=1;i<intervals.length;i++){
           ArrayList<Integer> row=new ArrayList<>();
            if(e>=intervals[i][0]){
                if(s>intervals[i][0])
                s=intervals[i][0];
                if(e<=intervals[i][1])
                e=intervals[i][1];
            }
            else{//when no overlapping then we add to list
            row.add(s);
            row.add(e);
           // System.out.println(row);
            newint.add(row);//adding rows to lists
           // System.out.println(newint);
            s=intervals[i][0];
            e=intervals[i][1];
            }
        }
    newint.add(new ArrayList<>(Arrays.asList(s,e)));//adding the last interval
    int [][] newin=new int[newint.size()][2];
   for(int i =0;i<newin.length;i++){
        newin[i][0]=newint.get(i).get(0);
        newin[i][1]=newint.get(i).get(1);
    }
    return newin;
}
}