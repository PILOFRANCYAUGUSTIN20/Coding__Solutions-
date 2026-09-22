// Problem: Ransom Note
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/ransom-note/
// Solved on: 2026-09-22T05:48:23.041Z

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) 
            return false;
        int[] letters = new int[26];
        
        for (char c : magazine.toCharArray())
            letters[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (letters[c-'a'] == 0) 
                return false;
            letters[c-'a']--;
        }
        return true;
    }
}