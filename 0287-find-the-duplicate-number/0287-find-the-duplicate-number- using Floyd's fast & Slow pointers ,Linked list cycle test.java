class Solution {
    public int findDuplicate(int[] nums) {
    /*linked list cycle floyd's algo solving i.e. slow and fast pointers. Since the values are b/w 1 to n and indexes are b/w 0 to n. Every value will mean an index i.e point to another value. If to values point to the same value that no. is repeated. In floyd's algo we first find the point of first intersectio of slow and fast pointer 
    then we make another pointer from start and keep incrementing both new one and slow one by 1 until they meet. the meet point is the beginning of the cycle and the duplicte number.*/
    int s=0;int f=0;
        //using do while as originally they are equal and we need to ignore this case
     do{     
        s=nums[s];
        f=nums[nums[f]];
        }while(s!=f);
    int np=0;
    while(s!=np)
    {
        s=nums[s];
        np=nums[np];
    }
    return np;
    }
}
