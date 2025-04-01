class Solution {
    public boolean place(int m,int[] position, int minforce){
        int lastfix=0;m--;
        for(int i=1;i<position.length;i++){
            int f=position[i]-position[lastfix];// current force
            if(f>=minforce){//atleast f minforce toh hona hi chaiye
                lastfix=i;// oh jagah mil gyi, ball placed
                m--;// balls reduce karo
            if(m==0)// all balls successfully placed
            return true;
            }
        }
        return false;// nhi ho paya min force ek baar achive krke sari balls ko place krna.
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1;//the min posible force
        int r=position[position.length-1]-position[0];//max possible force
        int maxforce=1;
        while(l<=r){
            int midf=l+(r-l)/2;
            if(place(m,position,midf)){
                l=midf+1;
                maxforce=midf;// oh new sabse jada min force
            }
            else
            {
                r=midf-1;
            }
            // isse jyada possible hi nhi
        }
    return maxforce;//sabse bada min force return
    }
}