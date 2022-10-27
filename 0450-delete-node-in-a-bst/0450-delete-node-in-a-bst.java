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
  public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        return iterative(root, key);
    }
	public TreeNode iterative(TreeNode root, int key) {
        if(root==null) return root;
        TreeNode cur=root, pre=null; //pre is cur's parent
        while(cur!=null && cur.val!=key) {
            pre=cur;
            if(cur.val<key) cur=cur.right;
            else cur=cur.left;
        }
        if(pre==null) return delete(cur); //case: tree=[0] key=0
        if(pre.left==cur) pre.left=delete(cur);
        else pre.right=delete(cur);
        return root;
    }
    public TreeNode delete(TreeNode cur) {
        if(cur==null) return null;
        if(cur.left==null) return cur.right;
        if(cur.right==null) return cur.left;
        TreeNode next=cur.right;
        while(next.left!=null) next=next.left; 
        next.left=cur.left;
        return cur.right;
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
        
        /*
        
        RECURSION SOLUTION
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
        
        
        
        */
        
    
}