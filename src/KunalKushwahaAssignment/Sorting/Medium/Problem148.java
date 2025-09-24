package KunalKushwahaAssignment.Sorting.Medium;

public class Problem148 {
    public static void main(String[] args) {

    }
//        Definition for singly-linked list.
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {

      }
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }

  }

    public static ListNode sortList(ListNode head){
        // base case
        if(head == null && head.next ==null){
            return head;
        }
        ListNode mid = middle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoList(left , right);
    }
    public static ListNode mergeTwoList(ListNode l1 , ListNode l2){
        ListNode ans = new ListNode();
        ListNode tail = ans;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1;
                tail = tail.next;
                l1 = l1.next;
            }
            else{
                tail.next = l2;
                tail = tail.next;
                l2 = l2.next;
            }
        }

        while(l1 != null){
            tail.next = l1;
            tail = tail.next;
            l1 = l1.next;

        }
        while(l2 != null){
            tail.next = l2;
            tail = tail.next;
            l2 = l2.next;

        }

        return ans.next;

    }

    public static ListNode middle(ListNode node){
        ListNode prev = null;
        ListNode slow = node;
        ListNode fast = node;
        int length = 0;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            length++;
        }
        if(prev != null){
            prev.next = null;
        }
        return slow;
    }

}
