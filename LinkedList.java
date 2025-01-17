import java.util.ArrayList;
import java.util.List;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node firstNode;
    public void insert(int toInsert){
        if (this.firstNode == null){
            this.firstNode = new Node(toInsert);
        } else {
            Node curNode = this.firstNode;
            while (curNode != null){
                if (curNode.next == null){
                    curNode.next = new Node(toInsert);
                    return;
                }
                curNode = curNode.next;
            }
        }
    }
    public Node reverseList(Node head) {
        List<Integer> list = new ArrayList<>();
        Node current = head;
        while(current != null){
            list.add(current.data);
            current = current.next;
        }
        Node newhead = null;
        for (int i = list.size()-1; i >= 0; i--){
            if (newhead == null){
                newhead = new Node(list.get(i));
            } else {
                current = newhead;
                while (current != null){
                    if (current.next == null){
                        current.next = new Node(list.get(i));
                    }
                    current =  current.next;
                }
            }
        }
        return newhead;
    }
    public Node reverse(Node head){
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextTemp = current.next;  // Save the next node
            current.next = prev;               // Reverse the current node's pointer
            prev = current;                    // Move prev and current one step forward
            current = nextTemp;
        }
        return prev;  // prev will be the new head of the reversed list
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(5);
        linkedList.insert(10);
        linkedList.insert(100);
        Node revNode = linkedList.reverse(linkedList.firstNode);
        System.out.println(revNode.data);
    }
}
