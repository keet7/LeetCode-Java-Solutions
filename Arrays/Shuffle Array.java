[Question 5](https://leetcode.com/problems/shuffle-the-array/)
             
Solution:
class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] res = new int[2 * n];
        for (int i = 0, j = n, idx = 0; idx < res.length; i++, j++) {
            res[idx++] = nums[i];
            res[idx++] = nums[j];
        } 
        return res; 
    }
}             
