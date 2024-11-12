/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int pr_idx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> mp= new HashMap();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        return BT(preorder,0,inorder.length-1,mp);
    }
    public TreeNode BT(int []pr,int in_st,int in_ed,HashMap<Integer,Integer> mp){
        if(in_st>in_ed || pr_idx>=pr.length){
            return null;
        }
        TreeNode rt =new TreeNode(pr[pr_idx]);
        int pos=mp.get(pr[pr_idx++]);
        rt.left=BT(pr,in_st,pos-1,mp);
        rt.right=BT(pr,pos+1,in_ed,mp);
        return rt;
    }
}