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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null)
        return result;
        Queue<TreeNode> qq=new LinkedList<>();
        qq.offer(root);
        while(!qq.isEmpty()){
            int size=qq.size(); int ele=0;
            while(size-->0){
                TreeNode f=qq.poll();
                if(f!=null){
                    ele=f.val;
                    if(f.left!=null)
                    qq.offer(f.left);
                    if(f.right!=null)
                    qq.offer(f.right);
                } 
            }
            result.add(ele);
            }
    return result;
    }
}