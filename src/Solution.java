import helpers.ArrayListFunctions;
import utils.*;

class Solution{
    public static void main(String [] args){
        int[] arr1 = {9,9,9,9,9,9,9};
        int[] arr2 = {9,9,9,9};

        ListNode l1 = ArrayListFunctions.populateArrayList(arr1);
        ListNode l2 = ArrayListFunctions.populateArrayList(arr2);

        ListNode resultList = new AddTwoNumbers().addTwoNumbers(l1, l2);

        ArrayListFunctions.printArrayList(resultList);
    }
}