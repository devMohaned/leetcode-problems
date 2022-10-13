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
    public TreeNode invertTree(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
 
    if(root!=null){
        queue.add(root);
    }
 
    while(!queue.isEmpty()){
        TreeNode p = queue.poll();
        if(p.left!=null)
            queue.add(p.left);
        if(p.right!=null)
            queue.add(p.right);
 
        TreeNode temp = p.left;
        p.left = p.right;
        p.right = temp;
    }
 
    return root;    
    }
}