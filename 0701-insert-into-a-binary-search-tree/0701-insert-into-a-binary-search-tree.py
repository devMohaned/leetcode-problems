# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def insertIntoBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        newNode = TreeNode(val = val)
        if(not root):
            return newNode

        current = root
        while(True):
            if(val > current.val):
                if(current.right):
                    current = current.right
                else:
                    current.right = newNode
                    return root
            else:
                if(current.left):
                    current = current.left
                else:
                    current.left = newNode
                    return root
        