// Problem: Length of Last Word
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/length-of-last-word/
// Solved on: 2026-08-23T17:15:26.941Z

class Solution {
    public int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        String lastWord = strArr[strArr.length-1];
        return lastWord.length();
    }
}