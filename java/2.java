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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null){
            return l2;
        }
        
        if(l2 == null){
            return l1;
        }
        
        int value = 0, carry = 0;
    
        ListNode dummyNode = new ListNode(0);
        ListNode currentNode = dummyNode;
        
        while(l1 != null || l2 != null || carry !=0){
            
            int l1Value = l1 == null ? 0 : l1.val;
            int l2Value = l2 == null ? 0 : l2.val;
            
            value = (l1Value + l2Value + carry) % 10;
            carry = (l1Value + l2Value + carry) / 10;
            
            
            ListNode newNode = new ListNode(value);
            currentNode.next = newNode;
            currentNode = newNode;
            
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
  
        }
        
        return dummyNode.next;
        
    }
}
