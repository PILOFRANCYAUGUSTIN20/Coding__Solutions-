// Problem: Fibonacci Number
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: python
// Verdict: Accepted
// URL: https://leetcode.com/problems/fibonacci-number/
// Solved on: 2026-08-27T10:33:25.096Z

class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        a , b = 0,1
        nxt= 0
        if n==0 :
            return 0
        if n==1 :
            return 1
        for i in range(2,n+1):
            nxt = a+b
            a=b
            b=nxt
        return b   