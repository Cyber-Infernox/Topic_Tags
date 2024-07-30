class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int index = 1;
        int ans = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                count = 1;
                nums[index] = nums[i];
                index++;
                ans++;
            } else if (count < 2) {
                count++;
                nums[index] = nums[i];
                index++;
                ans++;
            }
        }

        return ans;
    }
}