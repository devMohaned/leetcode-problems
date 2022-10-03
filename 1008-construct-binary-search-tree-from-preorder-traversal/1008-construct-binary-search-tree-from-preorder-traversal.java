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
    int currentInfoIdx = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int LOWEST = Integer.MIN_VALUE;
        int HIGHEST = Integer.MAX_VALUE;
        return constructBstFromRange(LOWEST, HIGHEST, preorder);
    }
    
   public TreeNode constructBstFromRange(int lowerBound, int higherBound,int[] preorder){
       if(currentInfoIdx == preorder.length)
           return null;
       
       int rootValue = preorder[currentInfoIdx];
       if(rootValue < lowerBound || rootValue >= higherBound)
           return null;
       
       currentInfoIdx++;
       TreeNode left = constructBstFromRange(lowerBound, rootValue, preorder);
       TreeNode right = constructBstFromRange(rootValue, higherBound, preorder);
       return new TreeNode(rootValue, left, right);
       
   }
}