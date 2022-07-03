package DSA;


public class MergeSortedLists {

    class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }

    public ListNode mergeTwoLists(ListNode A, ListNode B) {

        ListNode current = new ListNode(0);
        ListNode temp = current;
        while(A != null && B != null){
            if(A.val < B.val){
                temp.next = A;
                A = A.next;
            }
            else{
                temp.next = B;
                B = B.next;
            }
            temp = temp.next;
        }

        if(A != null){
            temp.next  = A;
            A = A.next;
        }
        if(B != null){
            temp.next = B;
            B = B.next;
        }

        return current.next;

    }
}
