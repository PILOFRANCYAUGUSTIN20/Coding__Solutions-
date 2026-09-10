// Problem: Count Primes
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/count-primes/
// Solved on: 2026-09-10T08:30:49.089Z

class Solution {
    public int countPrimes(int n) {
        if (n <= 2) 
            return 0;
        boolean[] isComposite = new boolean[n];
        int count = 0;

        for (int i = 2; i * i < n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
            }
        }

        return count;
    }
}
