class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int lm = height[0], rm = height[height.length - 1];
        int water = 0;
        while (l < r) {
            if (lm < rm) {
                l++;
                if (lm < height[l]) {
                    lm = height[l];
                } else {
                    water += lm - height[l];
                }
            } else {
                r--;
                if (rm < height[r]) {
                    rm = height[r];
                } else {
                    water += rm - height[r];
                }
            }
        }
        return water;
    }
}