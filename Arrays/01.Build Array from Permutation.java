[Question 1](https://leetcode.com/problems/build-array-from-permutation/)

Solution:
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            nums[i] = n * (nums[nums[i]] % n) + nums[i];
        }
        for(int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }
        return nums;
    }
}
