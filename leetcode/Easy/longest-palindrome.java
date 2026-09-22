// Problem: Longest Palindrome
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/longest-palindrome/
// Solved on: 2026-09-22T05:38:07.172Z

class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1){
            return 1;
        }
        int [] freq = new int[128];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        int len = 0;
        boolean odd = false;
        for(int i=0;i<128;i++){
            if(freq[i]%2 ==0){
                len+=freq[i];
            }
            else{
                len+=freq[i]-1;
                odd = true;
            }
        }
        if(odd){
            len++;
        }
        return len;
    }
}