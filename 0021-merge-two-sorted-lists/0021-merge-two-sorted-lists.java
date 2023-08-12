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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return null;
        else if(l1 != null && l2 == null)
            return l1;
        else if(l1 == null && l2 != null)
            return l2;
        
        ListNode nodes = new ListNode();
        ListNode result = nodes;
        
        while(l1 != null || l2 != null)
        {
            if(l1 != null && l2 != null)
            {
                int firstVal = l1.val;
                int secondVal = l2.val;
                
                if(firstVal < secondVal)
                {
                    nodes.next = new ListNode(firstVal);
                    l1 = l1.next;
                    nodes = nodes.next;
                }else{
                    nodes.next = new ListNode(secondVal);
                    l2 = l2.next;
                    nodes = nodes.next; 
                }
            }else if(l1 == null)
            {
                nodes.next = l2;
                return result.next;
            } else if(l2 == null)
            {
                nodes.next = l1;
                return result.next;
            }
        }
        
        return result.next;
        
    }
}