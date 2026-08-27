// Problem: Subtract the Product and Sum of Digits of an Integer
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: python
// Verdict: Accepted
// URL: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// Solved on: 2026-08-27T10:03:03.616Z

class Solution(object):
    def subtractProductAndSum(self, n):
        """
        :type n: int
        :rtype: int
        """
        Sum = 0 
        product = 1
        while n!=0 :
            digit = n%10 
            Sum+=digit
            product*=digit
            n//=10
        return product-Sum 
       
    
        