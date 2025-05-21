class Solution {
    public int earliestFullBloom(int[] pT, int[] gT) {
        ArrayList<int[]> pairs=new ArrayList<>();
        for(int i=0;i<pT.length;i++){
            pairs.add(new int[]{pT[i],gT[i]});
        }
        pairs.sort((pair1,pair2)->Integer.compare(pair2[1],pair1[1]));
        int bloom=0;int prev=0;
        for (int[] array : pairs) {
            System.out.println(Arrays.toString(array));
        }
        for(int i=0;i<gT.length;i++){
            bloom=Math.max(prev+pairs.get(i)[0]+pairs.get(i)[1],bloom);
            prev=prev+pairs.get(i)[0];
        }
        return bloom;
    }
}