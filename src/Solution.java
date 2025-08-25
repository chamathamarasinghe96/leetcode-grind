class Solution {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 8, 9};
        int target = 6;

        int[] result = new FirstAndLastPosition().findFirstAndLastPositionBinarySearch(arr, target) ;
        for (int i : result) {
            System.out.println(i);
        }
    }
}