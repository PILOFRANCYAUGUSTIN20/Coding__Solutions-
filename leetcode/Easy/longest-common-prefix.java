// Problem: Longest Common Prefix
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/longest-common-prefix/
// Solved on: 2026-10-01T11:02:53.699Z

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null)
            return "" ;
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length() || strs[j].charAt(i)!=c)
                    return strs[0].substring(0,i);
            }
        }
        return strs[0];
       
    }
}