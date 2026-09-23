// Problem: Reverse Words in a String III
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/reverse-words-in-a-string-iii/
// Solved on: 2026-09-23T04:49:57.510Z

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String res = "";
        for(int i=0;i<words.length;i++){
            int left =0,right = words[i].length()-1;
            char[] ch = words[i].toCharArray();
            while(left<right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            words[i] = new String(ch);
        }
        res = String.join(" ",words);
        return res;
    }
   
}