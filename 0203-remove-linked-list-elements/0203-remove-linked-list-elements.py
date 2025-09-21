# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        prev, current = dummy, head

        while(current):
            next = current.next
            if(current.val == val):
                prev.next = next
            else:
                prev = current

            current = next
        return dummy.next