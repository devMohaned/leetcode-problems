# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        lowest = min(p.val, q.val)
        highest = max(p.val, q.val)

        while(root):
            if(lowest > root.val):
                root = root.right
            elif(highest < root.val):
                root = root.left
            else:
                return root
        return root