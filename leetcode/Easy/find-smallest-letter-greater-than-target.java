// Problem: Find Smallest Letter Greater Than Target
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Solved on: 2026-09-01T10:53:30.357Z

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char ch : letters){
            if(ch > target){
                return ch ;
            }
        }
        return letters[0];
    }
}