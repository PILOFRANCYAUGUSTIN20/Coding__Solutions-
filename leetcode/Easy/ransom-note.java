// Problem: Ransom Note
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/ransom-note/
// Solved on: 2026-09-22T05:49:09.193Z

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) 
            return false;
        int[] letters = new int[26];
        
        for (char ch : magazine.toCharArray())
            letters[ch-'a']++;

        for (char ch : ransomNote.toCharArray()){
            if (letters[ch-'a'] == 0) 
                return false;
            letters[ch-'a']--;
        }
        return true;
    }
}