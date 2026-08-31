// Problem: Next Greater Element II
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/next-greater-element-ii/
// Solved on: 2026-08-31T14:46:31.762Z

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 2 * n; i++) {
            int current = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < current) {
                ans[stack.pop()] = current;
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return ans;
    }
}