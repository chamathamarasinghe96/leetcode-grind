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

    public static double findMaxAvgWithSlidingWindow(int[] nums, int k) {
        int idxStart = 0;
        int idxEnd = k - 1;

        int maxSum = 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        idxStart++;
        idxEnd++;

        for (; idxEnd < nums.length; idxEnd++, idxStart++) {
            windowSum += (nums[idxEnd] - nums[idxStart - 1]);
            maxSum = maxSum < windowSum ? windowSum : maxSum;
        }

        return (double) maxSum / k;
    }

    public static double findMaxAvgWithSlidingWindowOptimized(int[] nums, int k) {
        int windowSum = 0;
        double maxAvg = Double.NEGATIVE_INFINITY;
        int idxStart = 0;
        
        for (int idxEnd = 0; idxEnd < nums.length; idxEnd++) {
            windowSum += nums[idxEnd];
            
            if (idxEnd - idxStart + 1 == k) {
                maxAvg = Math.max((double) windowSum / k, maxAvg);
                windowSum -= nums[idxStart];
                idxStart++;
            }
        }

        return maxAvg;
    }
}
