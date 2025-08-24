class Solution {
    public static void main(String[] args) {
        int[] arr = {};
        int target = 6;

        int[] result = FirstAndLastPosition.findFirstAndLastPosition(arr, target);
        for (int i : result) {
            System.out.println(i);
        }
    }
}