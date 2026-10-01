// Problem: Longest Common Prefix
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/longest-common-prefix/
// Solved on: 2026-10-01T10:56:51.610Z

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0] ,s2 = strs[strs.length-1];
        int ind = 0;
        while(ind < s1.length() && ind <s2.length()){
            if(s1.charAt(ind) == s2.charAt(ind)){
                ind++;
            }
            else{
                break;
            }
        } 
        return strs[0].substring(0,ind);
    }
}