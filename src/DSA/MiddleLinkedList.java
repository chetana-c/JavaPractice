package DSA;

public class MiddleLinkedList {

    public class Node{
        int val;
        Node next;
        Node(int x) {
            val = x;
            next = null;
        }
    }
    public Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
