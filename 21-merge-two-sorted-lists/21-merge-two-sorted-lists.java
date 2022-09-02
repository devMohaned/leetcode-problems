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
        else if(l1 == null && l2 != null)
            return l2;
        else if(l1 != null && l2 == null)
            return l1;
        
        
        ListNode nodes = new ListNode();
        ListNode result = nodes;
        
        while(l1 != null || l2 != null)
        {
           if(l1 != null && l2 != null)
           {
               int val1 = l1.val;
               int val2 = l2.val;
                if(val1 < val2)
                {
                    ListNode addedNode = new ListNode(val1);
                    nodes.next = addedNode;
                    nodes = nodes.next;
                    l1 = l1.next;
                }else{
                     ListNode addedNode = new ListNode(val2);
                    nodes.next = addedNode;
                    nodes = nodes.next;
                    l2 = l2.next;
                }
           }else if(l1 == null && l2 != null)
           {
               nodes.next = l2;
               return result.next;
           }else if(l1 != null && l2 == null)
           {
                   nodes.next = l1;
               return result.next;
           }else{
            return result.next;
           }
        }
        return result.next;
        
    }
}