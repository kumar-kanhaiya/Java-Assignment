package KunalKushwahaAssignment.Sorting.Medium;

public class Problem147 {
    public static void main(String[] args) {
        ListNode node = new ListNode(4,
                new ListNode(2, new ListNode(1, new ListNode(3))));
        System.out.println(insertionSortList(node));
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
          System.out.print("Start");
        while(node.next != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
          System.out.println("End");
      }

    public static ListNode insertionSortList(ListNode node) {
        while(node.next != null) {
            if (node.val > node.next.val) {
                    swap(node, node.next);
                    node = node.next;
            }
            else {
                    node = node.next;
            }

        }
        return node;
    }
    public static void swap(ListNode first , ListNode second ){
        ListNode temp = first;
        first.val = second.val;
        second.val = temp.val;

    }

}
