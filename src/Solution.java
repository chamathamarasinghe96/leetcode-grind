import helpers.ArrayListFunctions;
import utils.*;

class Solution{
    public static void main(String [] args){
        int[] arr1 = {2, 4, 3};
        int[] arr2 = {5, 6, 4};

        ListNode l1 = ArrayListFunctions.populateArrayList(arr1);
        ListNode l2 = ArrayListFunctions.populateArrayList(arr2);

        ListNode ln = new AddTwoNumbers().addTwoNumbers(l1, l2);
    }
}