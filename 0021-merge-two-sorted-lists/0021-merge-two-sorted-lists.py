# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        left, right = list1, list2
        dummy = temp = ListNode()
        while(left or right):
            if(left is None):
                dummy.next = right
                break
            
            if(right is None):
                dummy.next = left
                break
                
            if(left.val < right.val):
                dummy.next = left
                left = left.next
            else:
                dummy.next = right
                right = right.next
            dummy = dummy.next



        return temp.next

