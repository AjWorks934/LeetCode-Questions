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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr= new ArrayList<>();
        helper(root,arr);
        return arr;
    }
    public void helper(TreeNode root, ArrayList<Integer> arr) {
       if(root!=null){
        arr.add(root.val);
        helper(root.left,arr);
        helper(root.right,arr);
    }
    }
    
}