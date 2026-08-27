// Problem: Add Digits
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: python
// Verdict: Accepted
// URL: https://leetcode.com/problems/add-digits/
// Solved on: 2026-08-27T10:22:37.929Z

class Solution(object):
    def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        sum =0
        digit=0
        while(num>=10):
            while(num!=0):
                digit=num%10
                sum=sum+digit
                num=num/10 
            num=sum
            sum=0       
        return num 