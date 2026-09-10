// Problem: Reverse Integer
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: c
// Verdict: Accepted
// URL: https://leetcode.com/problems/reverse-integer/
// Solved on: 2026-09-10T15:44:27.462Z

int reverse(int x){
    long rev=0;
    while(x!=0){
        int digit = x%10;
        x/=10;
        rev = rev*10 + digit;
    }
    if (rev > INT_MAX || rev < INT_MIN) 
        return 0;
    return (int)rev;
}