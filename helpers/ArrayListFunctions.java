package helpers;

import utils.ListNode;

public class ArrayListFunctions {
    public static ListNode populateArrayList(int[] numArray){
        ListNode nodeHead = new ListNode();
        nodeHead.val = numArray[0];
        ListNode currentNode = new ListNode();
        nodeHead.next = currentNode;

        for (int i = 1; i < numArray.length - 1; i++) {
            currentNode.val = numArray[i];
            currentNode.next = new ListNode();
            currentNode = currentNode.next;
        }

        currentNode.val = numArray[numArray.length - 1];
        currentNode.next = null;

        return nodeHead;
    }

    public static void printArrayList(ListNode nodeHead){

        ListNode currentNode = nodeHead;

        while (currentNode != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }
}
