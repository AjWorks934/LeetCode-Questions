class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count =0;
        int arr[]=new int[2];
        int x=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))
            {   count++;
                if(count>2)
                    return false;
                arr[x]=i;
                x++;
            }
        }
        if(count==0)
            return true;
        if(count==2){
            if((s1.charAt(arr[0])==s2.charAt(arr[1]))&&(s1.charAt(arr[0])==s2.charAt(arr[1])))
            return true;
        }
        return false;
    }
}