// Problem: Sum of Square Numbers
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/sum-of-square-numbers/
// Solved on: 2026-08-27T10:55:25.751Z

class Solution {
    public boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (long) Math.sqrt(c);

        while (a <= b) {
            long sum = a * a + b * b;

            if (sum == c)
                return true;
            else if (sum < c)
                a++;
            else
                b--;
        }
        return false;
    }
}
    