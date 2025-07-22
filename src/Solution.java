class Solution {
    public static void main(String[] args) {
        int slidingWindow = 4;
        int[] numbers = {1, 12, -5, -6, 50 , 3};

        System.out.println(new MaxAvgSubArray().findMaxAvgSubArray(numbers, slidingWindow));
    }
}