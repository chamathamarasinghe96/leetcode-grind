
public class FirstAndLastPosition {

    public int[] findFirstAndLastPosition(int[] nums, int target) {
        int[] positions = new int[2];

        boolean isArrayFound = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && !isArrayFound) {
                positions[0] = i;
                isArrayFound = true;

                if (i == nums.length - 1) {
                    positions[1] = i;
                    return positions;
                }

            } else if (nums[i] != target && isArrayFound) {
                positions[1] = i - 1;
                return positions;
            } else if (isArrayFound && i == nums.length - 1) {
                positions[1] = i;
                return positions;
            }
        }
        return new int[] { -1, -1 };
    }

    public int[] findFirstAndLastPositionBinarySearch(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) {
                return new int[] { 0, 0 };
            } else {
                return new int[] { -1, -1 };
            }
        }
        return new int[] { findFirst(nums, target), findLast(nums, target) };
    }

    private int findLast(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;

        while (first <= last) {

            int mid = first + (last - first) / 2;

            if (nums[mid] == target && (mid == (nums.length - 1) || nums[mid + 1] > target)) {
                return mid;
            } else if (nums[mid] > target) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }

    private int findFirst(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;

        while (first <= last) {

            int mid = first + (last - first) / 2;

            if (nums[mid] == target && (mid == 0 || nums[mid - 1] < target)) {
                return mid;
            } else if (nums[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }

}
