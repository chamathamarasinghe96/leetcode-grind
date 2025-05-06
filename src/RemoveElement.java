class RemoveElements {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0 || (nums.length == 1 && nums[0] == val))
            return 0;

        int k = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = k; j >= i; j--) {
                if (nums[i] == val && nums[k] != val) {
                    nums[i] = nums[k];
                    nums[k--] = val;
                    break;
                } else if (nums[i] != val) {
                    break;
                } else {
                    k--;
                }
            }
        }
        return k + 1;
    }
}