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
    public TreeNode deleteNode(TreeNode root, int val) {
        if(root == null)
            return root;
  
            // Go Right (Greater Than Case)
            if(val > root.val) root.right = deleteNode(root.right, val);
            // Go Left (Smaller Than Case)    
        else if(val < root.val) root.left = deleteNode(root.left, val);
        // You're in (Equal Case)    
        else {
            // No Children Found (Return)
                if(root.left == null && root.right == null)   return null;
            // ONLY Right Child Available
            if(root.left == null)  return root.right;
            // ONLY Left Child Available
            else if(root.right == null) return root.left;
            
            // Has 2 children
            // Get Smallest In Size By Either Getting LeftMost/RightMost
            TreeNode successor = getLeftMost(root.right);
         //   TreeNode successor = getRightMost(root.left);
            root.val = successor.val;
     root.right = deleteNode(root.right, successor.val);  
        //   root.left = deleteNode(root.left, successor.val);
        
        }
        
        
        return root;

        
        
        
    }
    
    public TreeNode getLeftMost(TreeNode root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }
    
     public TreeNode getRightMost(TreeNode root) {
        while(root.right != null) {
            root = root.right;
        }
        return root;
    }
        
        
        
    
}