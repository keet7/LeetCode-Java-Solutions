[Question 7](https://leetcode.com/problems/number-of-good-pairs/)
             
Solution:            
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        for(int i = 0; i<nums.length; i++) {
            for(int j = 0; j<i; j++) {
                if(nums[i] == nums[j]) {
                    result++;
                }
            }
        }
        return result;
    }
}
