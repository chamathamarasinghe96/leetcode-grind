class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++){
            if(nums[k] < nums[i]){
                nums[++k] = nums[i];
            }
        }
        return k + 1;
    }

    static void printArray(int[] nums){
        for(int num: nums){
            System.out.print(num + ",");
        }
        System.out.println("_");
    }
}