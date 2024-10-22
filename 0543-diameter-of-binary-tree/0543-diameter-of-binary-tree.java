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
    int dia=0;
    public int maxDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int lt=maxDepth(root.left);
        int rt=maxDepth(root.right);
        dia=Integer.max(dia,lt+rt);
        int h = Integer.max(lt,rt);
        return h+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {                            
        maxDepth(root);                      
        return dia;       
    }
}