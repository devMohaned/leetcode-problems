# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if(not q and not p):
            return True
        elif(not q or not p):
            return False

        queue = deque([(p,q)])

        while(queue):
            left, right = queue.popleft()
            
            if(left is None and right or right is None and left or left and right and left.val != right.val):
                return False
            
            if(left is not None and right is not None):
                queue.append((left.left, right.left))
                queue.append((left.right, right.right))

        return True