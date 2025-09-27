# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        stack = [root]
        parent = {root: None}

        while(p not in parent or q not in parent):
            current = stack.pop()
            if(current.left):
                stack.append(current.left)
                parent[current.left] = current
            if(current.right):
                stack.append(current.right)
                parent[current.right] = current

        
        ancestors = set()
        pNode = p
        while (pNode):
            ancestors.add(pNode)
            pNode = parent[pNode]
        
        qNode = q
        while qNode not in ancestors:
            qNode = parent[qNode]

        return qNode