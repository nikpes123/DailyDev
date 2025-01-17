package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeTwoSortedLists {
    // 21. Merge Two Sorted Lists
    ListNode firstNode;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        if (list1.val > list2.val){
            head = list2;
            list2 = list2.next;
        } else {
            head = list1;
            list1 = list1.next;
        }
        ListNode current = head;
        while (list1 != null && list2 != null){
            if (list1.val > list2.val){
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            } else {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            current = current.next;
        }
        if (list1 != null){
            current.next = list1;
        }
        if (list2 != null){
            current.next = list2;
        }
        return head;
    }
    public void insert(int toInsert){
        if (this.firstNode == null){
            this.firstNode = new ListNode(toInsert);
        } else {
            ListNode curNode = this.firstNode;
            while (curNode != null){
                if (curNode.next == null){
                    curNode.next = new ListNode(toInsert);
                    return;
                }
                curNode = curNode.next;
            }
        }
    }
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println(); // Print a newline at the end
    }
    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists1 = new MergeTwoSortedLists();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 4));
        for (int i = 0; i < list1.size(); i++){
            mergeTwoSortedLists1.insert(list1.get(i));
        }
        MergeTwoSortedLists mergeTwoSortedLists2 = new MergeTwoSortedLists();
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 4));
        for (int i = 0; i < list2.size(); i++){
            mergeTwoSortedLists2.insert(list2.get(i));
        }
        MergeTwoSortedLists mergeTwoSortedLists3 = new MergeTwoSortedLists();
        ListNode return_val = mergeTwoSortedLists3.mergeTwoLists(mergeTwoSortedLists1.firstNode, mergeTwoSortedLists2.firstNode);
        mergeTwoSortedLists3.printList(return_val);
    }
 
}
