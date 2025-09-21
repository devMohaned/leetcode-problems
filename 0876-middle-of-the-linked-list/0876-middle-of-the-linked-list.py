# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        total = 0

        temp = head
        while temp.next is not None:
            total += 1
            temp = temp.next
        
        nodeToFind = total / 2 if total % 2 == 0 else (total / 2) + 1
        for index in range(0,int(nodeToFind)):
             head = head.next
        return head