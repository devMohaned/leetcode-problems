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
    int visited = 0;
    int latestValue = 0;
    public int kthSmallest(TreeNode root, int k) {
        inOrderTraverse(root,k);
        return latestValue;
    }
    
    private void inOrderTraverse(TreeNode root, int k){
          if(root == null || visited >= k) return;
        
         inOrderTraverse(root.left, k);
    if(visited < k)
        {         
        visited++;
        latestValue = root.val;
        inOrderTraverse(root.right,k);
}
    }
}