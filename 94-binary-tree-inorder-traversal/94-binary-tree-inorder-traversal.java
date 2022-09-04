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
    List<Integer> list = new ArrayList(); 
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        
        return list;
    }
    
    private void traverse(TreeNode node)
    {
        if(node == null)
            return;
        
        if(node.left != null) traverse(node.left);
        list.add(node.val);
        if(node.right != null) traverse(node.right);
        }
    
}