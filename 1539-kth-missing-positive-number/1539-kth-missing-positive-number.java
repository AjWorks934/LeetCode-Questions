class Solution {
    public static int findKthPositive(int[] arr, int k) {
        int m = 0, i = 0;
        for (int c = 1; ; c++) {
            if (i < arr.length && arr[i] == c) {
                i++;
            } else {
                m++;
                if (m == k) {
                    return c;
                }
            }
        }
    }
}