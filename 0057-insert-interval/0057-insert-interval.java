class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // List to store the final result
        ArrayList<int[]> result = new ArrayList<>();
        
        // Get the start and end of the new interval
        int s = newInterval[0];
        int e = newInterval[1];
        
        for (int i = 0; i < intervals.length; i++) {
            // Case 1: No overlap and current interval ends before new interval starts
            if (intervals[i][1] < s) {
                result.add(intervals[i]);
            } 
            // Case 2: No overlap and new interval ends before current interval starts
            else if (intervals[i][0] > e) {
                result.add(new int[]{s, e});  // Add the new interval before any further intervals
                s = intervals[i][0];
                e = intervals[i][1];
            } 
            // Case 3: Overlapping intervals - merge
            else {
                s = Math.min(s, intervals[i][0]);  // Extend start of the new interval
                e = Math.max(e, intervals[i][1]);  // Extend end of the new interval
            }
        }

        // Add the final merged interval
        result.add(new int[]{s, e});
        
        // Convert ArrayList to array and return
        return result.toArray(new int[result.size()][]);
    }
}
