// Problem: Squares of a Sorted Array
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/squares-of-a-sorted-array/
// Solved on: 2026-09-24T04:58:26.633Z

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = (int)Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }
}