class Solution {
    public int helper(String str, int n, int arr[]) {
        int prev=0;
        if(str.charAt(n-1)!='0')
            prev=1;
        int prevd=1;
        for (int i = n - 2; i >= 0; i--) {
            int ans=0;
            if (str.charAt(i) != '0')
            {
                ans=prev;
           // if (i+1 < n ) {
                if ((str.charAt(i) == '1') || (str.charAt(i) == '2' && str.charAt(i + 1) <= '6'))
                    ans += prevd;
            }

            prevd=prev;
            prev=ans;
        }

        return prev;
    }
    public int numDecodings(String s) {
        int arr[] = new int[s.length() + 1];
        return helper(s, s.length(), arr);
    }
}