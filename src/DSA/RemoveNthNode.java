package DSA;

public class RemoveNthNode {

    public class Node{
        public int val;
        public Node next;
        Node(int x){
            val = x;
            next = null;
        }
    }

    public Node removeNthFromEnd(Node head, int n){
        Node start = new Node(0);
        Node slow = start, fast = start;
        slow.next = head;
        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=1; i<n; i++){
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}
