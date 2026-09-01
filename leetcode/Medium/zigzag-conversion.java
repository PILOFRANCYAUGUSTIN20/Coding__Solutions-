// Problem: Zigzag Conversion
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/zigzag-conversion/
// Solved on: 2026-09-01T10:40:06.697Z

class Solution {
    public String convert(String s, int numRows) {
        if(numRows ==1 || numRows>=s.length()){
            return s ;
        }
        StringBuilder[] arr = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            arr[i] = new StringBuilder();
        }
        int Rows =0;
        boolean down =true;
        for(int i=0;i<s.length();i++){
            arr[Rows].append(s.charAt(i));
            if(Rows ==0 )
                down = true;
            else if(Rows == numRows-1)
                down = false;
            if(down)
                Rows++;
            else
                Rows--;
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<numRows;i++){
            ans.append(arr[i]);
        }
        String res = ans.toString();
        return res ;
    }
}