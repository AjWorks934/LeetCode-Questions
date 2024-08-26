class Solution {
    public int minOperations(String[] logs) {
        int c=0;
        //int folder=0;
        for(int i=0;i<logs.length;i++)
        {
            if(logs[i].equals("../"))
            {
                if(c!=0)
                    c--;
                    //System.out.println(c+"(-");
            }
            else if(Character.isLetterOrDigit(logs[i].charAt(0))){
                c++;
                // System.out.println(c+"(+");
        }
        }
        return c;
    }
}