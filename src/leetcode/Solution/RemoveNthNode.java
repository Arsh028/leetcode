package src.leetcode.Solution;

import src.leetcode.dataStructure.ListNode;

class RemoveNthNode {

  public static void main(String[] args) {
    Integer[] array = { 1, 2, 3, 4, 5 };
    ListNode head = ListNode.constructListFromArray(array);
    RemoveNthNode removeNthNode = new RemoveNthNode();
    ListNode ans = removeNthNode.removeNthFromEnd(head, 2);
    ListNode.printLinkedList(ans);
  }

  public int len(ListNode head, int n) {
    int count = 1;
    ListNode temp = head;
    while (temp.next != null) {
      count++;
      temp = temp.next;
    }
    return count - n + 1;
  }

  public ListNode removeNthFromEnd(ListNode head, int n) {
    int length = len(head, n);
    ListNode prev = null;
    ListNode temp = head;
    for (int i = 1; i < length; i++) {
      prev = temp;
      temp = temp.next;
    }
    if (prev == null) {
      return head = head.next;
    } else {
      prev.next = temp.next;
      return head;
    }
  }
}
