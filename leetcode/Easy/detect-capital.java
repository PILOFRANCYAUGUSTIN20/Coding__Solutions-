// Problem: Detect Capital
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/detect-capital/
// Solved on: 2026-09-22T06:47:35.861Z

class Solution {
    public boolean detectCapitalUse(String word) {
        boolean res = false;
        String org = word;
        String upCase = word.toUpperCase();
        String lowCase = word.toLowerCase();
        String firstCap = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        return upCase.equals(word) || lowCase.equals(word) || firstCap.equals(word);
    }
}