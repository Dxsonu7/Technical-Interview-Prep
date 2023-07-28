package LeetCode;

/* Time: O(n^2) | Space: O(1)
   First approach: bruteforce */
class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) // base case
            return 0;

        int product = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int trackSubArray = 1;
            for (int j = i; j < nums.length; j++) {
                trackSubArray *= nums[j];
                product = Math.max(product, trackSubArray);
            }
        }
        return product;
    }
}