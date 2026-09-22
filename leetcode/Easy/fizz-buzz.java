// Problem: Fizz Buzz
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/fizz-buzz/
// Solved on: 2026-09-22T06:05:04.409Z

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String str="";
            if(i%3 == 0 && i%5 == 0) 
                list.add("FizzBuzz");
            else if(i%3 == 0)
                list.add("Fizz");
            else if(i%5 == 0)
                list.add("Buzz");
            else{
                str+=i;
                list.add(str);
            }
        }
        return list;
    }
}