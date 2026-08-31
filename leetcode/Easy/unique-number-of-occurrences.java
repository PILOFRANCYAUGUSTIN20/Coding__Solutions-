// Problem: Unique Number of Occurrences
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/unique-number-of-occurrences/
// Solved on: 2026-08-31T14:20:32.494Z

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];
        for (int num : arr) {
            freq[num + 1000]++;
        }
        for (int i = 0; i < 2001; i++) {
            for (int j = i + 1; j < 2001; j++) {
                if (freq[i] != 0 && freq[i] == freq[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}