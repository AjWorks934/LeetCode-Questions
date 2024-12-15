class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                double nextGainA = getGain(a[1] + 1, a[2] + 1);
                double nextGainB = getGain(b[1] + 1, b[2] + 1);
                return Double.compare(nextGainB, nextGainA);
            }
            return Double.compare(b[0], a[0]);
        });

        for (int i = 0; i < classes.length; i++) {
            double pass = classes[i][0];
            double total = classes[i][1];
            double gain = getGain(pass, total);
            pq.offer(new double[]{gain, pass, total, i}); 
        }

        for (int i = 0; i < extraStudents; i++) {
            double[] top = pq.poll();
            double pass = top[1];
            double total = top[2];
            int index = (int) top[3];

            classes[index][0]++;
            classes[index][1]++;

            double newGain = getGain(classes[index][0], classes[index][1]);
            pq.offer(new double[]{newGain, classes[index][0], classes[index][1], index});
        }
        double totalAverage = 0;
        for (int[] clazz : classes) {
            totalAverage += (double) clazz[0] / clazz[1];
        }

        return totalAverage / classes.length;
    }
    private double getGain(double pass, double total) {
        double currentRatio = pass / total;
        double potentialRatio = (pass + 1) / (total + 1);
        return potentialRatio - currentRatio;
    }
}
