package LeetCode;

public class LinkedListCycle {
    // 141. Linked List Cycle
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;           // Move slow pointer one step
            fast = fast.next.next;      // Move fast pointer two steps
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
        // Helper function to create a linked list with a cycle
    public ListNode createCycleList() {
            ListNode node1 = new ListNode(3);
            ListNode node2 = new ListNode(2);
            ListNode node3 = new ListNode(0);
            ListNode node4 = new ListNode(-4);
    
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node2; // Creating a cycle by pointing back to node2
    
            return node1;
        }
    
        public static void main(String[] args) {
            LinkedListCycle solution = new LinkedListCycle();
    
            // Create the linked list with a cycle
            ListNode head = solution.createCycleList();
    
            // Check for cycle and debug
            solution.hasCycle(head);
        }
}
