# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        dummy = ListNode(-501, head)
        leftPrevNode, currentNode = dummy, head
        for _ in range(0, left - 1):
            leftPrevNode = currentNode
            currentNode = currentNode.next
          
        prev = None
        for _ in range(right - left + 1):
            next = currentNode.next
            currentNode.next = prev
            prev = currentNode
            currentNode = next
        leftPrevNode.next.next = currentNode
        leftPrevNode.next = prev
        return dummy.next
        