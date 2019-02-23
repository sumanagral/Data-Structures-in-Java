// Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

// Example 1:


// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// Example 2:

// Input: head = [1], n = 1
// Output: []
// Example 3:

// Input: head = [1,2], n = 1
// Output: [1]
 

// Constraints:

// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
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
     if(head==null || head.next == null)
     return null;
     ListNode temp2 = head;
     ListNode slow = head;
     ListNode fast = head;
     ListNode temp = head;
     int i=0;
     while(fast!=null && fast.next!=null)
     {
        
       if(i<=n)
       {
           fast = slow;
           slow = slow.next;   
       }
       else
       {
          temp = slow;
          slow = slow.next;
          fast = fast.next.next;
       }
       i++;
     } 
     temp.next = slow.next;  
     return temp2;
    }

}