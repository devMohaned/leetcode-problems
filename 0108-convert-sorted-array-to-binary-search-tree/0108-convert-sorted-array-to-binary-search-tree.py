# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        if not nums:
            return None
        
        n = len(nums)
        mid = n//2
        root = TreeNode(nums[mid])
        queue = deque()
        queue.append((root, 0, mid - 1))
        queue.append((root, mid + 1, n-1))

        while(queue):
            parent, leftBound, rightBound = queue.popleft()
            if(leftBound <= rightBound):
                mid = (leftBound + rightBound) // 2
                child = TreeNode(nums[mid])
                if(nums[mid] < parent.val):
                    parent.left = child
                else:
                    parent.right = child
                queue.append((child, leftBound, mid - 1))
                queue.append((child, mid + 1, rightBound))

        return root

        