class Solution { //dp //bfs //math based reverse
    public int brokenCalc(int startValue, int target) {
        if(target<=startValue)
        return startValue-target;
        if(target%2==0 && target>startValue){
          return 1+ brokenCalc(startValue,target/2);
        }
        else
          return 1+ brokenCalc(startValue,target+1);
    }
}