// Problem: Number of 1 Bits
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/number-of-1-bits/
// Solved on: 2026-08-29T17:30:06.493Z

class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }

        return count;
    }
}