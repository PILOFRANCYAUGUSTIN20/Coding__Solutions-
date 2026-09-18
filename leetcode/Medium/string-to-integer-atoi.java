// Problem: String to Integer (atoi)
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/string-to-integer-atoi/
// Solved on: 2026-09-18T04:42:11.264Z

class Solution {
    public int myAtoi(String s) {
        s = s.trim(); 
        if (s.isEmpty()) return 0;

        int i = 0;
        int sign = 1;

        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        long result = 0; 

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch < '0' || ch > '9') {
                break; 
            }

            result = result * 10 + (ch - '0');

            if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (result * sign);
    }
}

