[Question 5](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
             
Solution:
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highest = 0;
        ArrayList<Boolean> list = new ArrayList<>(candies.length);
        int[] temp = candies;
        highest = FindHighest(temp);
        System.out.println(highest);
        for(int i = 0; i<candies.length; i++) {
            int sum = candies[i] + extraCandies;
            if(sum >= highest) {
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;
    }
    
    public static int FindHighest(int[] arr) {
         int max = -1;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
             
