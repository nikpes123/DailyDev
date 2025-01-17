package LeetCode;
class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next; 
    }
}
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Edge case: If either list is empty, there can be no intersection
             if (headA == null || headB == null) {
                 return null;
             }
     
             ListNode pA = headA;
             ListNode pB = headB;
     
             // Traverse both lists, switching to the other list once the end is reached
             while (pA != pB) {
                 // If we reach the end of one list, move to the head of the other list
                 pA = (pA == null) ? headB : pA.next;
                 pB = (pB == null) ? headA : pB.next;
             }
     
             // Either both pointers are null, meaning no intersection, or both are at the intersection node
             return pA;
         }
}
