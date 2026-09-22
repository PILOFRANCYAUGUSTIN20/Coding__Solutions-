// Problem: Repeated Substring Pattern
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/repeated-substring-pattern/
// Solved on: 2026-09-22T14:28:42.279Z

class Solution {
    public boolean repeatedSubstringPattern(String s) {

        String doubled = s + s;

        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
}
