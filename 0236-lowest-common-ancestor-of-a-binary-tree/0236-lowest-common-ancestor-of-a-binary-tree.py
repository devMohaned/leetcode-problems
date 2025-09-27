# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        parent = {root: None}
        stack = [root]

        # Build parent pointers until both p and q are discovered
        while p not in parent or q not in parent:
            node = stack.pop()
            if node.left:
                parent[node.left] = node
                stack.append(node.left)
            if node.right:
                parent[node.right] = node
                stack.append(node.right)

        # Collect ancestors of p
        ancestors = set()
        cur = p
        while cur:
            ancestors.add(cur)
            cur = parent[cur]

        # First ancestor of q that appears in p's ancestors is the LCA
        cur = q
        while cur not in ancestors:
            cur = parent[cur]
        return cur