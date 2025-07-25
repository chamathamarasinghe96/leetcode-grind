public class MaxAvgSubArray {
    public static double findMaxAvgSubArray(int[] nums, int k) {
        int maxSum = 0;
        for (int i = 0; i < nums.length - k; i++) {
            int sumSubArray = 0;
            for (int j = i; j < i + k; j++) {
                sumSubArray += nums[j];
            }
            if (sumSubArray > maxSum) maxSum = sumSubArray;
        }
        return (double) maxSum / k;
    }
}
