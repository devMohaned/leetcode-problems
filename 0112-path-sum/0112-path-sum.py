# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if(not root):
            return False

        stack = [(root, root.val)]
        while(stack):
            current, value = stack.pop()
            if(not current.left and not current.right and value == targetSum):
                return True
            
            if(current.left):
                stack.append((current.left, value + current.left.val))
            
            if(current.right):
                stack.append((current.right, value + current.right.val))
        return False