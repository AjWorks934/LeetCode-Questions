class Solution {
    public int maxProfit(int[] price) {
        int buy=price[0];
        int profit=0;
        for(int i=1;i<price.length;i++){
            if(price[i-1]<price[i]){
            profit=profit+(price[i]-price[i-1]);
            }
        }
        return profit;
    }  
}