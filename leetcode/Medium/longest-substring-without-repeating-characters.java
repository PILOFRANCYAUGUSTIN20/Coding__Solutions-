// Problem: Longest Substring Without Repeating Characters
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Solved on: 2026-09-26T10:51:47.164Z

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        int[] freq=new int[128];
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            freq[ch]++;
            while(freq[ch]>1){
                freq[s.charAt(left)]--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}