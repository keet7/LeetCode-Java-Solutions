[Question 4](https://leetcode.com/problems/richest-customer-wealth/)

Solution:
class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] ints : accounts) {
            int sum = 0;
            for(int anInt : ints) {
                sum = sum + anInt;
            }
            
            if(sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
