package LeetCode;

public class AddTwoNumbers {
    //  Leet Code Question No 2
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Create the new node for the current sum's digit
            ListNode newNode = new ListNode(sum % 10);

            // If head is null, initialize it with the first node
            if (head == null) {
                head = newNode;
                current = head;
            } else {
                current.next = newNode;  // Link the new node to the current node
                current = current.next;  // Move the current pointer
            }

            carry = sum / 10;  // Update carry for the next iteration
        }
        return head;
      }
}
