class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        rev =0
        y=x
        x=abs(x)
        while x!=0:
            digit = x%10
            rev = rev*10+digit 
            x=x//10
            if rev<(-2**31):
                return 0
            if rev>(2**31-1):
                return 0
            
        if y<0 :
            return -1*rev
        else:
            return rev
        

        