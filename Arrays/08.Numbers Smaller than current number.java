[Question 8](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)
             
Solution:
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for(int i = 0; i<nums.length; i++) {
            count = 0;
            for(int j =0; j<nums.length; j++) {
                if(nums[j] < nums[i]) {
                    count++;
                }
                result[i] = count;
            }
        }
        return result;
    }
}         
