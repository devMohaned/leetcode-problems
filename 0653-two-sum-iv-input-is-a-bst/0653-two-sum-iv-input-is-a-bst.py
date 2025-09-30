# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findTarget(self, root: Optional[TreeNode], k: int) -> bool:
        visited = {}
        queue = deque([root])

        while(queue):
            value = queue.popleft()
            remaining = k - value.val

            if(remaining in visited):
                return True

            visited[value.val] =  remaining

            if(value.left):
                queue.append(value.left)
            if(value.right):
                queue.append(value.right)
        return False