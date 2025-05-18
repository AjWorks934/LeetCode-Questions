class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;int l=0;int r=tokens.length-1;int max=0;
        while(l<=r){// aage badha hai use nhi hua issiliye equal is needed.
            if(power>=tokens[l]){
                power=power-tokens[l];
                score=score+1;
                max=Math.max(max,score);
                l++;
            }
            else if(score>=1){
                power=power+tokens[r];
                score=score-1;
                r--;
            }
            else
            break;
        }
        return max;
    }
}