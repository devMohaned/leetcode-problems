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
      private List<Integer> list = new ArrayList();
    public List<Integer> postorderTraversal(TreeNode root) {
        
        traverse(root);
        return list;
    }
    
    private void traverse(TreeNode node)
    {
        
        if(node == null)return;
        
        if(node.left != null) traverse(node.left);
        if(node.right != null) traverse(node.right);
           list.add(node.val);
 }
}