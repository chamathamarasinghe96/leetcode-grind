package helpers;

import utils.ListNode;

public class ArrayListFunctions {
    public static ListNode populateArrayList(int[] numArray) {
        ListNode nodeHead = null;

        if (numArray.length > 0) {
            nodeHead = new ListNode();
            nodeHead.val = numArray[0];
            ListNode currentNode = nodeHead;

            for (int i = 1; i < numArray.length; i++) {
                currentNode.next = new ListNode();
                currentNode = currentNode.next;
                currentNode.val = numArray[i];
            }
        }

        return nodeHead;
    }

    public static void printArrayList(ListNode nodeHead) {

        ListNode currentNode = nodeHead;

        while (currentNode != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }
}
