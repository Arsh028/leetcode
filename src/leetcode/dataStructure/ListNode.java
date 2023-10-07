package src.leetcode.dataStructure;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

  public int val;

  public ListNode next;

  public ListNode() {}

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static ListNode constructListFromArray(Integer[] array) {
    if (array == null || array.length == 0 || array[0] == null) {
      return null;
    }

    int length = array.length;
    ListNode root = new ListNode(array[0]);

    ListNode currentNode = root;
    ListNode newNode;
    for (int i = 1; i < length; i++) {
      newNode = new ListNode(array[i]);
      currentNode.next = newNode;
      currentNode = currentNode.next;
    }
    return root;
  }

  public static void printLinkedList(ListNode listNode) {
    if (listNode == null) {
      System.out.println("node is null");
      return;
    }
    List<Integer> list = new ArrayList<>();
    list.add(listNode.val);
    while (listNode.next != null) {
      list.add(listNode.next.val);
      listNode = listNode.next;
    }

    System.out.println(list);
  }
}
