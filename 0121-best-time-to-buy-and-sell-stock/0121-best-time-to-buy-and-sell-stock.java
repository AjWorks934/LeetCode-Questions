class Solution {
    public int maxProfit(int[] price) {
        int buy=price[0];
        int profit=0;
        for(int i=1;i<price.length;i++){
            if(price[i]<buy)
            buy=price[i];
            else if(price[i]-buy>profit){
                profit = price[i]-buy;
            }
        }
        return profit;
    }  
}