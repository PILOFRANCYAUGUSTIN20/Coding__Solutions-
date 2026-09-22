// Problem: Find the Difference
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/find-the-difference/
// Solved on: 2026-09-22T05:07:25.251Z

class Solution {
    public char findTheDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        int i = 0;
        while (i < sChars.length && sChars[i] == tChars[i]) {
            i++;
        }
        return tChars[i];
        
    }
}