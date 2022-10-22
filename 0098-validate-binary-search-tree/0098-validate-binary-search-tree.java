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
    public boolean isValidBST(TreeNode root) {
        return isValidHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
private boolean isValidHelper(TreeNode node, long lowest, long highest)
    {
        if(node == null)
            return true;
        if(!(node.val > lowest && node.val < highest))
            return false;
    
        return 
            (isValidHelper(node.left, lowest,node.val) && 
            isValidHelper(node.right,node.val, highest));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  /* 
             return isValidHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);

  private boolean isValidHelper(TreeNode node, long lowest, long highest)
    {
        if(node == null)
            return true;
        if(!(node.val < highest && node.val > lowest))
            return false;
        
        return (isValidHelper(node.left, lowest, node.val) && isValidHelper(node.right, node.val, highest));
    }*/
    
}