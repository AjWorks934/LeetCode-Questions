class Solution {
   public String longestCommonPrefix(String[] S) {
    if (S == null || S.length == 0) return "";
    Arrays.sort(S);
    String first = S[0], last = S[S.length - 1];
    int i = 0;
    while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
        i++;
    }
    return first.substring(0, i);
}
}