// Problem: Maximum Subarray
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/maximum-subarray/
// Solved on: 2026-09-26T10:29:35.201Z

class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=nums[0],max=nums[0];
        for(int ind=1;ind<nums.length;ind++){
            currentsum=Math.max(nums[ind],currentsum+nums[ind]);
            max=Math.max(max,currentsum);
        }
        return max;
    }
}