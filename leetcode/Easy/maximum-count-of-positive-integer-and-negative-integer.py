// Problem: Maximum Count of Positive Integer and Negative Integer
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: python
// Verdict: Accepted
// URL: https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
// Solved on: 2026-08-24T10:13:06.449Z

class Solution(object):
    def maximumCount(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        countPos = 0
        countNeg = 0
        for i in nums :
            if i>0 :
                countPos+=1 
            elif i<0 :
                countNeg+=1
        """ 
        if countPos < countNeg:
            return countNeg 
        else:
            return countPos 
        """
        return max(countPos ,countNeg)
        