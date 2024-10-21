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
    public int maxDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int x = Integer.max(maxDepth(root.left),maxDepth(root.right));
        x=x+1;
        return x;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root!=null){
        int d1=maxDepth(root.left)+maxDepth(root.right);
        int d2=diameterOfBinaryTree(root.left);
        int d3=diameterOfBinaryTree(root.right);
        return Integer.max(d1,Integer.max(d2,d3));
    }
    return 0;
    }
}