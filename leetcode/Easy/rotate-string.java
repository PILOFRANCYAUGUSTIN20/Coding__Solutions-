// Problem: Rotate String
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/rotate-string/
// Solved on: 2026-09-30T06:17:23.482Z

class Solution {
    public boolean rotateString(String s, String goal) {
        String res = s+s ;
        if(s.length() != goal.length()){
            return false;
        }
        else if (res.contains(goal)){
            return true;
        }
        return false;
    }
}