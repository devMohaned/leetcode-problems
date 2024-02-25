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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode();
        ListNode leftPointer = left;
        ListNode right = new ListNode();
        ListNode rightPointer = right;
        
        while(head != null)
        {
            int current = head.val;
            if(current < x)
            {
                leftPointer.next = new ListNode(current);
                leftPointer = leftPointer.next;
            }else{
                rightPointer.next = new ListNode(current);
                rightPointer = rightPointer.next;
            }
            
            head = head.next;
        }
        
        leftPointer.next = right.next;
        return left.next;
    }
}