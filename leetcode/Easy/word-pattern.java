// Problem: Word Pattern
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/word-pattern/
// Solved on: 2026-09-23T04:09:37.765Z

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            
            if (charToWord.containsKey(c) && !charToWord.get(c).equals(w)) {
                return false;
            }

            if (wordToChar.containsKey(w) && wordToChar.get(w) != c) {
                return false;
            }
            
            charToWord.put(c, w);
            wordToChar.put(w, c);
        }
        
        return true;
    }
}