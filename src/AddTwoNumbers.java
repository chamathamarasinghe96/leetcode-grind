import utils.ListNode;

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int resultToPowerTen = getNumberSummation(l1) + getNumberSummation(l2);
        ListNode resultList = formArrayList(resultToPowerTen);
        System.out.println(resultToPowerTen);
        return l1;
    }

    int getNumberSummation(ListNode nodeHead){
        ListNode currentNode = nodeHead;
        int result = 0, exponent = 0;

        while (currentNode != null) {
            result += currentNode.val * Math.pow(10, exponent);
            currentNode = currentNode.next;
            exponent++;
        }

        return result;
    }

    ListNode formArrayList(int n) {
        ListNode resultList = new ListNode();
        resultList.val = n % 10;
        ListNode currNode = new ListNode();
        resultList.next = currNode;
        n /= 10;

        while (n != 0) {
            currNode.val = n % 10;
            currNode.next = new ListNode();
            currNode = currNode.next;
            n /= 10;
        }

        return resultList;
    }
}