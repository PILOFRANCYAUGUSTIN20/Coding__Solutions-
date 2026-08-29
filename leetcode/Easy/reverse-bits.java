// Problem: Reverse Bits
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/reverse-bits/
// Solved on: 2026-08-29T17:28:22.558Z

class Solution {
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n = n >>> 1;
        }

        return result;
    }
}