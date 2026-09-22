// Problem: Number of Segments in a String
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/number-of-segments-in-a-string/
// Solved on: 2026-09-22T06:19:59.376Z

class Solution {
    public int countSegments(String s) {
        if(s.length() == 0)
            return 0;
        int segment = 0 ;
        String[] strArr = s.split(" ");
        for (String word : strArr) {
            if (!word.isEmpty()) {
                segment++;
            }
        }
        return segment;
    }
}