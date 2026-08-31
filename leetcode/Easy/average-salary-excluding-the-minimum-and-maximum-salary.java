// Problem: Average Salary Excluding the Minimum and Maximum Salary
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
// Solved on: 2026-08-31T14:43:50.622Z

class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<salary.length;i++){
            if(max < salary[i]){
                max = salary[i];
            }
            if(min > salary[i]){
                min = salary[i];
            }
        }
        double sum = 0,div = 0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]!=max && salary[i]!=min){
                sum+=salary[i];
                div++;
            }
        }
        
        double res = (sum/div);
        return res ;
    }
}