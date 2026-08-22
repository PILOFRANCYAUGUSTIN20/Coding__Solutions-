class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x < 0: return None
        if x == 0 or x == 1: return x
    
        low = 0
        high = x
        
        while low <= high:
            mid = (low + high) // 2
            square = mid * mid
            
            if square == x:
                return mid  # Found the exact integer root
            elif square < x:
                low = mid + 1
            else:
                high = mid - 1
                
        return high # Returns the closest integer floor
        
            