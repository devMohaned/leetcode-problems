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
    // Time Complexity: O(N) where N is the number of nodes.
    // Space Complexity: O(N) where N is the number of nodes required to be saved in memory as extra space.
    public ListNode reverseList(ListNode head) {
     
        ListNode pre = null;
        ListNode current = head;
        while(current != null)
        {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
    
        return pre;
            
            
    }
}
