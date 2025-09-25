package KunalKushwahaAssignment.Sorting.Medium;

public class Problem147 {
    public static void main(String[] args) {
        ListNode node = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        System.out.println(insertionSortList(node));
        displayListNode(node);
        swap(node,node.next);
        displayListNode(node);

    }

//      Definition for singly-linked list.
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {

          }
          ListNode(int val) {
              this.val = val;
          }
          ListNode(int val, ListNode next) {
              this.val = val;
              this.next = next;
          }
      }

      public static void displayListNode(ListNode node){
        ListNode current = node;
          System.out.print("Start");
        while(current != null){
            System.out.print(current.val + " -> ");
            current = current.next;
        }
          System.out.println("End");
      }

    public static ListNode insertionSortList(ListNode node) {
        ListNode check = new ListNode(0);
        ListNode current = node;
        while(current != null){
            ListNode next = current.next;
            ListNode prev = check;
            while(next!= null && prev.next.val < current.val){
                prev = prev.next;
            }
            current.next = prev.next;
            prev.next = current;

            current = next;
        }
        return check.next;
    }
    public static void swap(ListNode first , ListNode second ){
        int temp = first.val;
        first.val = second.val;
        second.val = temp;


    }

}
