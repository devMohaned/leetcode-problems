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
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode tailPointer = dummyNode, splitPointer = dummyNode;
        int length;

        // Step 1: Get the total length of the list
        for (length = 0; tailPointer.next != null; length++) {
            tailPointer = tailPointer.next;
        }

        // Step 2: Find the new break point (length - k % length)th node
        int stepsToNewHead = length - (k % length);
        for (int i = 0; i < stepsToNewHead; i++) {
            splitPointer = splitPointer.next;
        }

        // Step 3: Perform the rotation
        tailPointer.next = dummyNode.next;  // Connect last node to the head (circular)
        dummyNode.next = splitPointer.next; // New head
        splitPointer.next = null;           // Break cycle

        return dummyNode.next;
    }
}