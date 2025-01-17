package LeetCode;
public class ReorderList {
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
    public void reorderList(ListNode head) {
        // split the listNode into half
        // reverse the second half
        // then combine the two halfs
        ListNode current = head;
        int length = 0;
        while( current != null){
            length ++;
            current = current.next;
        }
        // Step 2: Find the 
        current = head;
        for(int i = 1; i < (length/2); i++){
            current = current.next;
        }

        // Step 3: Reverse the second half of the list
        ListNode secondHalf = LeetCode.ReverseLinkedList.reverse(current.next);
        current.next = null;
        // Step 4: Merge the two halves
        ListNode firstHalf = head;
        while (secondHalf != null) {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;
            
            firstHalf.next = secondHalf;  // Connect first half node to second half node
            secondHalf.next = temp1;      // Connect second half node to first half node
            
            firstHalf = temp1;  // Move firstHalf pointer
            secondHalf = temp2; // Move secondHalf pointer
        }
        // Step 5: Terminate the list properly
        if (firstHalf != null) {
            firstHalf.next = null;  // Ensure the last node points to null to avoid cycles
        }
    }
}
}
