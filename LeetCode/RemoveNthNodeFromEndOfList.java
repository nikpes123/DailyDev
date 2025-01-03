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
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode curNode = head;
        while (curNode != null){
            length++;
            curNode = curNode.next;
        }
        if ((length - n) == 0){
            return head.next;
        }
        curNode = head;
        for (int i = 1; i < (length-n); i++){
            curNode = curNode.next; 
        }
        curNode.next = curNode.next.next;
        return head;
    }
}
