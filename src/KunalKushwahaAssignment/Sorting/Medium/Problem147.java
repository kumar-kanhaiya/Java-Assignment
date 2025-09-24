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
        ListNode current = node;
        while(current != null) {
                if (current.next != null && current.val > current.next.val) {
                    swap(current, current.next);
                }
                current = current.next;

        }
        return node;
    }
    public static void swap(ListNode first , ListNode second ){
        ListNode temp = first;
        first = second;
        second = temp;


    }

}
