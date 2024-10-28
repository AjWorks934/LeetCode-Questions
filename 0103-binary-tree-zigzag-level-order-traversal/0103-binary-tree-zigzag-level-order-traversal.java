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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        Queue<TreeNode> qq= new LinkedList<>();boolean flag=true;
        qq.offer(root);
        while(!qq.isEmpty())
        {
            int row=qq.size();
            List<Integer> level= new ArrayList<>();
            while(row-->0){
                TreeNode f=qq.poll();
                if(f!=null){
                    level.add(f.val);
                if(f.left!=null)
                    qq.offer(f.left);
                if(f.right!=null)
                    qq.offer(f.right);
                }
            }
            if(root!=null){
                if(!flag)
                    Collections.reverse(level);
                result.add(level);
                flag=!flag;
            }
        }
        return result;
    }
}