class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1;
        int right=  piles[piles.length-1];
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(canEatInTime(piles, mid, h)) 
            right = mid - 1;
            else 
            left = mid + 1;
        }
        return left;
    }
    public boolean canEatInTime(int piles[], int k, int h){
        int thours = 0;
        for(int pile : piles){
            int hour = pile / k;
            thours += hour;
            if(pile % k != 0) 
            thours++;
            if(thours>h)
            return false;
        }
        return thours <= h;
    }
}