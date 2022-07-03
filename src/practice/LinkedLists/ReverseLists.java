package practice.LinkedLists;

public class ReverseLists {
    /*
    Step - 1 ------
    [null]      -> [1] -> [2] -> [null]
    {prev,next} -> {curr}
    Step - 2 -------
    [null] -> [1]   -> [2]
    {prev} -> {curr}-> {next}
    Step - 3 -------- actual reversing is happening when ** curr.next = prev; **
    [null] <- [1]   -> [2]
    {prev} <- {curr}-> {next}
    Step - 4 --------
    [null] <- [1]       -> [2]
            {curr,prev} -> {next}
    Step - 5 --------
    [null] <- [1] -> [2]
            {prev}-> {curr, next}
     */
        public class Node {
        int val;
        Node next;
        Node(int x){
           val = x;
           next = null;
        }
    }

    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
            return prev;
    }
}
