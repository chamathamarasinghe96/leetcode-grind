public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        return findIndex(nums, 0, nums.length - 1, target);
    }

    public int findIndex(int[] nums, int start, int end, int target) {
        if (start > end) {
            return start;
        }

        int index = start + ((end - start) / 2);

        if (nums[index] == target) {
            return index;
        } else if (nums[index] > target) {
            end = index - 1;
            return findIndex(nums, start, end, target);
        } else {
            start = index + 1;
            return findIndex(nums, start, end, target);
        }
    }
}
