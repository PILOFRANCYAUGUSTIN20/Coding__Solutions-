// Problem: Pascal's Triangle
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/pascals-triangle/
// Solved on: 2026-11-25T09:57:23.488Z

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        int sum;
        for(int i=0; i<numRows; i++)
        {
            List<Integer> row=new ArrayList<>();
            for(int j=0; j<i+1; j++)
            {
                if(j==0 || j==i)
                    row.add(1);
                else
                {
                    sum=result.get(i-1).get(j-1) + result.get(i-1).get(j);   
                    row.add(sum); 
                }
            }
            result.add(row);
        }
        return result;
    }
}