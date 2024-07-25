// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length / 2];
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int elem = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                elem = nums[i];
            } else if (nums[i] == elem) {
                count++;
            } else if (nums[i] != elem) {
                count--;
            }
        }

        return elem;
    }
}