class Solution {
    public void reverse(int start, int end, int nums[]) {
        int mid = (start + end) / 2;
        for (int i = start; i <= mid; i++) {
            int temp = nums[i];
            nums[i] = nums[end];
            nums[end--] = temp;
        }
    }

    public void nextPermutation(int[] nums) {
        int len = nums.length;

        int i = len - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = len - 1;
            while (j >= i && nums[j] <= nums[i])
                j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        reverse(i + 1, len - 1, nums);
    }
}