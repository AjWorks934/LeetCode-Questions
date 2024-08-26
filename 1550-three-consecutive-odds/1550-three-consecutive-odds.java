class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean result=false; int c=0;
        for(int i=0;i<arr.length;i++)
        {   
            if(arr[i]%2!=0)
            {
                c++;
                if(c==3)
                {
                    result=true;
                    break;
                }
            }
            else
            {
                c=0;
            }
        }
         return result;   

        }
        
    }
