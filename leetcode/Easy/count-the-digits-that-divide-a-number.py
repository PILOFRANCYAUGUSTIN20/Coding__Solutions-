// Problem: Count the Digits That Divide a Number
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: python
// Verdict: Accepted
// URL: https://leetcode.com/problems/count-the-digits-that-divide-a-number/
// Solved on: 2026-08-27T10:08:35.693Z

class Solution(object):
    def countDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        temp = num
        count = 0 
        while num!=0:
            digit = num%10
            if(temp%digit == 0):
                count+=1
            num//=10
        return count 
        