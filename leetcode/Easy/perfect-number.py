// Problem: Perfect Number
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: python
// Verdict: Accepted
// URL: https://leetcode.com/problems/perfect-number/
// Solved on: 2026-08-27T10:53:02.876Z

class Solution(object):
    def checkPerfectNumber(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num<=1 :
            return False
        Sum ,temp = 0 ,num
        for i in range (1,int(num**0.5)+1):
            if num%i == 0 :
                Sum+=i
                if i != 1 and i != num // i:
                    Sum += num // i
        return  Sum==temp 
            