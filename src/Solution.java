import helpers.ArrayFunctions;

class Solution {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;

        System.out.println(new RemoveElements().removeElement(nums, val));

        ArrayFunctions.printArray(nums);
    }
}