// Problem: Remove Duplicates from Sorted Array
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Solved on: 2026-09-26T10:37:40.865Z

class Solution {
    public int removeDuplicates(int[] nums) {
        int upIndex = 1;   

        for (int target = 1; target < nums.length; target++) {
            if (nums[target] != nums[target-1]) {
                nums[upIndex] = nums[target]; 
                upIndex++;
            }
        }
        return upIndex;               
    }
}


