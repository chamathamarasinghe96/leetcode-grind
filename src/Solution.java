import helpers.ArrayListFunctions;

class Solution {
    public static void main(String[] args) {
        int[] arr1 = {5};
        int[] arr2 = {3};

        ArrayListFunctions.printArrayList(new MergeTwoSortedLists().mergeTwoLists(ArrayListFunctions.populateArrayList(arr1), ArrayListFunctions.populateArrayList(arr2)));;
    }
}