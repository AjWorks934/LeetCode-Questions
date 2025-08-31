class Solution {
    public int trap(int[] arr) {
        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int res = 0;

        // fill left array
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        // fill right array
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        // calculate the accumulated water element by element
        for (int i = 0; i < n - 1; i++) {
            int minOf2 = Math.min(left[i], right[i]);
            res += minOf2 - arr[i];
        }

        return res;
    }

    }
