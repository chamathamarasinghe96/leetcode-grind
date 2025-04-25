import utils.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultList = null;
        int n = 101, m = 101;
        if (list1 != null) {
            n = list1.val;
        }
        if (list2 != null) {
            m = list2.val;
        }
        if (n < 101 || m < 101) {
            resultList = new ListNode();
            resultList.next = null;
            if (n > m) {
                resultList.val = m;
                list2 = list2.next;
            } else {
                resultList.val = n;
                list1 = list1.next;
            }
        }

        ListNode currNode = resultList;
        while (list1 != null || list2 != null) {
            n = 101;
            m = 101;
            if (list1 != null) {
                n = list1.val;
            }
            if (list2 != null) {
                m = list2.val;
            }
            if (n > m) {
                currNode.next = new ListNode();
                currNode = currNode.next;
                currNode.val = m;
                currNode.next = null;
                list2 = list2.next;
            } else {
                currNode.next = new ListNode();
                currNode = currNode.next;
                currNode.val = n;
                currNode.next = null;
                list1 = list1.next;
            }
        }
        return resultList;
    }
}
