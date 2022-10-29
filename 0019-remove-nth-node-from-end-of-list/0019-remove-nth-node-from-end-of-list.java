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
        boolean isTraversed = false;
        ListNode trav = head;
        ListNode frontTrav = head;
        int travCount = 1;
        while(travCount <= n)
        {
            frontTrav = frontTrav.next;
            travCount++;
        }
         if(frontTrav == null)return head.next;
            
        
        while(frontTrav.next != null)
        {
            trav = trav.next;
            frontTrav = frontTrav.next;
            isTraversed = true;
        }
        trav.next =  trav.next.next;
        
        
        return head;
            
    }
}