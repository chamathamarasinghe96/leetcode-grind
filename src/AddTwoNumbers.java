import utils.ListNode;

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currNode1 = l1, currNode2 = l2, resultNode = new ListNode(), currNode = resultNode;

        int n, m, remainder = 0;
        n = currNode1.val;
        m = currNode2.val;
        currNode.val = (n + m + remainder) % 10;
        remainder = (n + m + remainder) / 10;

        currNode1 = currNode1.next;
        currNode2 = currNode2.next;

        while (currNode1 != null || currNode2 != null || remainder != 0) {
            n = 0;
            m = 0;
            currNode.next = new ListNode();
            currNode = currNode.next;

            if (currNode1 != null) {
                n = currNode1.val;
                currNode1 = currNode1.next;
            }
            if (currNode2 != null) {
                m = currNode2.val;
                currNode2 = currNode2.next;
            }

            currNode.val = (n + m + remainder) % 10;
            remainder = (n + m + remainder) / 10;

        }

        return resultNode;

    }
}