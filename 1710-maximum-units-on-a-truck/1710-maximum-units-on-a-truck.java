class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)-> Integer.compare(b[1],a[1]));
        for(int i=0;i<boxTypes.length;i++)
        System.out.println(Arrays.toString(boxTypes[i]));
        int cap=0;int ans=0;
       for(int i=0;i<boxTypes.length;i++){
        if(boxTypes[i][0]+cap<=truckSize){
            cap+=boxTypes[i][0];
            ans+=boxTypes[i][0]*boxTypes[i][1];
        }
        else
        {
            ans+=(truckSize-cap)*boxTypes[i][1];
            break;
        }
       }
       return ans;
    }
}