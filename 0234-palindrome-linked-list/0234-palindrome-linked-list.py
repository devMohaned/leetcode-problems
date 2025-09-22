# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if(head.next is None):
            return True
            
        slow = fast = head
        while(fast and fast.next):
            slow = slow.next
            fast = fast.next.next
        
        # We're now in the middle, reverse.
        def reverse(node):
            prev = None
            cur = node
            while cur:
                nxt = cur.next
                cur.next = prev
                prev = cur
                cur = nxt
            return prev
        
        if fast:  # odd length: slow is the middle → skip it
            second = reverse(slow.next)
        else:     # even length: slow is start of second half
            second = reverse(slow)

    # 3) compare halves
        p1, p2 = head, second
        while p2:
            if p1.val != p2.val:
                return False
            p1 = p1.next
            p2 = p2.next
        
        return True