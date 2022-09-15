/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
                    ListNode current = head;
while(current != null)
        {
            ListNode nextDistinctNode = current.next;
    while(nextDistinctNode != null && nextDistinctNode.val == current.val )
    {
        nextDistinctNode = nextDistinctNode.next;
    }
          current.next = nextDistinctNode;
            current = nextDistinctNode;
        }
        return head;
    }
}