// Problem: Subtract the Product and Sum of Digits of an Integer
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// Solved on: 2026-08-27T10:01:59.508Z

class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,product=1,digit;
        while(n!=0){
            digit=n%10;
            product=product*digit;
            sum=sum+digit;
            n=n/10;
        }
        return product-sum;
     }
}