import utils.ListNode;

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long resultToPowerTen = getNumberSummation(l1) + getNumberSummation(l2);
        System.out.println(getNumberSummation(l2));
        ListNode resultList = formArrayList(resultToPowerTen);
        return resultList;
    }

    long getNumberSummation(ListNode nodeHead) {
        ListNode currentNode = nodeHead;
        long result = 0;
        int exponent = 0;

        while (currentNode != null) {
            result += currentNode.val * Math.pow(10, exponent);
            currentNode = currentNode.next;
            exponent++;
        }

        return result;
    }

    ListNode formArrayList(long n) {
        ListNode resultList = new ListNode();
        resultList.val = (int)(n % 10);
        n /= 10;
        ListNode currNode = resultList;

        while (n != 0) {
            currNode.next = new ListNode();
            currNode = currNode.next;
            currNode.val = (int)(n % 10);
            n /= 10;
        }

        return resultList;
    }
}