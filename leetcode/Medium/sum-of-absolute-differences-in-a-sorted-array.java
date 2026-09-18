// Problem: Sum of Absolute Differences in a Sorted Array
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
// Solved on: 2026-09-18T05:05:01.388Z

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;

        for (int i = 0; i < n; i++) {
 
            int rightSum = totalSum - leftSum - nums[i];
            
            int leftCount = i;
            int rightCount = n - 1 - i;
            
            int leftTotal = (nums[i] * leftCount) - leftSum;
            int rightTotal = rightSum - (nums[i] * rightCount);
            
            res[i] = leftTotal + rightTotal;

            leftSum += nums[i];
        }
        return res;
    }
}

