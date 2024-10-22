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
    public boolean helper(TreeNode root, boolean x) {
        if(root==null)
        return  true;
       if(root!=null){
        if(root.left!=null && root.val!= root.left.val  )
        return false;
        if(root.right!=null && root.val!=root.right.val)
        return false;
        }
        return helper(root.left,x) && helper(root.right,x);
    }
    public boolean isUnivalTree(TreeNode root) {
        return helper(root,false);
    }
}