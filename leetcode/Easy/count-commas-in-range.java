// Problem: Count Commas in Range
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/count-commas-in-range/
// Solved on: 2026-09-10T05:57:43.636Z

class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        int digit = 0 ,temp=n;
        while(n!=0){
            n%=10;
            digit++;
            n/=10;
        }
        int comma = digit;
        int nums = temp-999;
        return comma*nums;
    }
}