class Solution {
    public int helper(int i, String str, int n,int arr[]) {
        if (i == n) {
            return 1;
        }
        if (str.charAt(i) == '0')
            return 0;
        int d = 0;
        int s = 0;

        if (arr[i] == 0) {
            s = helper(i + 1, str, n,arr);
            if (i < n - 1) {
                if ((str.charAt(i) == '1') || (str.charAt(i) == '2' && str.charAt(i + 1) <= '6')) {
                    d = helper(i + 2, str, n,arr);
                }
            }
            arr[i]=s+d;
        }

        return arr[i];
    }

    public int numDecodings(String s) {
        int arr[] = new int[s.length() + 1];
        return helper(0, s, s.length(),arr);
    }
}