package KunalKushwahaAssignment.Others;

import java.util.HashSet;

public class Problem3217 {
    public static void main(String[] args) {
        ListNode head = new ListNode();


    }

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
    public static ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            set.add(nums[i]);
        }

        // creating new ListNode ;
        ListNode ans = new ListNode(0);
        ListNode tail = ans;
        while(head != null){
            if(!set.contains(head.val)){
                tail.next = new ListNode(head.val);
                tail = tail.next;
            }
            head = head.next;
        }

        return ans.next;
    }
}
