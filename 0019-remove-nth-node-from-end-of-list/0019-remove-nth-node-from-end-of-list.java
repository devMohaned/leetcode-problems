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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode trav = head;
        ListNode frontTrav = head;
        int travCount = 0;
        
        while(++travCount <= n) frontTrav = frontTrav.next;
        
         if(frontTrav == null) return head.next;
            
        
        while(frontTrav.next != null)
        {
            trav = trav.next;
            frontTrav = frontTrav.next;
        }
        trav.next =  trav.next.next;
        
        
        return head;
            
    }
}