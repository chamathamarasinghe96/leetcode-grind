
public class FirstAndLastPosition {

    public static int[] findFirstAndLastPosition(int[] nums, int target) {
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

}
